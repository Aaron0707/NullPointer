package com.NullPointer.Service.MemberService.Imp;

import com.NullPointer.CoreDefine.CoreDefine.*;
import com.NullPointer.DAO.MemberDAO.IUserDAO;
import com.NullPointer.Models.Member.User;
import com.NullPointer.Models.Member.UserLogInfo;
import com.NullPointer.Service.MemberService.IUserService;
import com.NullPointer.Utils.RedisUtil;
import com.NullPointer.configuration.StatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Aaron on 11/19/16.
 * Email: aaronyang.memory@gmail.com
 */
@Transactional
@Service
public class UserServiceImp implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    public UserLogInfo login(User user) {
        if (user.getEmail()==null||user.getEmail().length()==0){
            return null;
        }
        UserLogInfo userLogInfo = new UserLogInfo();
        User tempUser = userDAO.findByAccount(user.getEmail());
        if (tempUser==null){
            userLogInfo.setSuccess(false);
            userLogInfo.setStatMessage(StatMessage.NO_USER);
        }else if (!tempUser.getPassword().endsWith(user.getPassword())){
            userLogInfo.setSuccess(false);
            userLogInfo.setStatMessage(StatMessage.PASSWORD_IS_CURRECT);
        }else {
            String token = UUID.randomUUID().toString();
            userLogInfo.setToken(token);
            userLogInfo.setSuccess(true);
            userLogInfo.setStatMessage(StatMessage.LOGIN_SUCCESS);
            userLogInfo.setUser(tempUser);

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.DAY_OF_YEAR,
                    calendar.get(Calendar.DAY_OF_YEAR) + 1);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            userLogInfo.setExpire(df.format(calendar.getTime()));

            RedisUtil.setex(token,24*60*60,userLogInfo);
        }

        return userLogInfo;
    }

    public User signUp(User user) {
        String email = user.getEmail();
        String password = user.getPassword();
        if (email==null || email.length() == 0 || password==null || password.length()==0) {
            return null;
        }

        user.setAccount(user.getEmail());
        user.setEngineer(false);
        user.setAccountType(AccountType.INDIVIDUAL);
        userDAO.insert(user);
        return user;
    }

    public User updateProfile(User user) {
        userDAO.updateByObject(user);

        return user;
    }
}
