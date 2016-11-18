package com.NullPointer.Controllers;

import com.NullPointer.Models.Member.Engineer;
import com.NullPointer.Models.Member.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Aaron on 11/18/16.
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage() {
        return "html/index.html";
    }


    @RequestMapping(value = "/gotoLogin", method = RequestMethod.GET)
    public String gotoLogin() {
        return "html/signup.html";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login() {
        
        return "html/profile.html";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signup(User user) {
        Engineer engineer = new Engineer();
        engineer.setID(1);
        return "html/profile.html";
    }
}
