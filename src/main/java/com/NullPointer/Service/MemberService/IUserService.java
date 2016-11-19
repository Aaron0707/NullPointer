package com.NullPointer.Service.MemberService;

import com.NullPointer.DAO.MemberDAO.IUserDAO;
import com.NullPointer.Models.Member.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Aaron on 11/18/16.
 */
public interface IUserService {

    public User login(User user);

    public User signUp(User user);
}
