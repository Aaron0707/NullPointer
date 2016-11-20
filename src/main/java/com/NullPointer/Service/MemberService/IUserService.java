package com.NullPointer.Service.MemberService;

import com.NullPointer.Models.Member.User;
import com.NullPointer.Models.Member.UserLogInfo;

/**
 * Created by Aaron on 11/18/16.
 * Email: aaronyang.memory@gmail.com
 */
public interface IUserService {
    /**
     * get user credentials and match with database.
     * @param user
     * @return User object or null
     */
    UserLogInfo login(User user);

    User signUp(User user);

    /**
     * allows user to modify profile information
     * @param user
     * @return User object
     */
    User updateProfile(User user);
}
