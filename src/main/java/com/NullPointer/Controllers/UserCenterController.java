package com.NullPointer.Controllers;

import com.NullPointer.Models.Member.User;
import com.NullPointer.Service.MemberService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Aaron on 11/19/16.
 * <p>
 * Email: aaronyang.memory@gmail.com
 * =======================================================
 */
@Controller
@RequestMapping(value = "/profile")
public class UserCenterController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/modification", method = RequestMethod.POST)
    public String modifyUser(@RequestBody User user) {
        User resultUser = userService.updateProfile(user);

//        return "html/profile.html";
        return null;
    }
}
