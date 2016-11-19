package com.NullPointer.Service.MemberService;

import com.NullPointer.DAO.MemberDAO.IUserDAO;
import com.NullPointer.Models.Member.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Aaron on 11/18/16.
 */
public interface IUserService {
    /**
     * get user credentials and match with database.
     * @param user
     * @return User object or null
     */
    public User login(User user);

    public User signUp(User user);

    /**
     * allows user to modify profile information
     * @param user
     * @return User object
     */
    public User updateProfile(User user);
}
