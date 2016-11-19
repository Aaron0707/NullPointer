package com.NullPointer.Controllers;

import com.NullPointer.Models.Member.Engineer;
import com.NullPointer.Models.Member.User;
import com.NullPointer.Service.MemberService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Aaron on 11/18/16.
 */

@Controller
public class IndexController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage() {
        return "html/index.html";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "html/signup.html";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody User user) {
        User resultUser = userService.login(user);
        if (resultUser!=null) {
            return "html/profile.html";
        }else {
            return "html/signup.html";
        }
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signup(User user) {
       User resultUser =  userService.signUp(user);
        if (resultUser!=null) {
            return "html/profile.html";
        }else {
            return "html/signup.html";
        }
    }
}
