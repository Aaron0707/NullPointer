package com.NullPointer.Service.MemberService.Imp;

import com.NullPointer.CoreDefine.CoreDefine.*;
import com.NullPointer.DAO.MemberDAO.IUserDAO;
import com.NullPointer.Models.Member.User;
import com.NullPointer.Service.MemberService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Aaron on 11/18/16.
 */
@Transactional
@Service
public class UserServiceImp implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    public User login(User user) {
        return userDAO.findByAccount(user.getAccount());
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
