package com.NullPointer.Controllers;

import com.NullPointer.CoreDefine.CoreDefine;
import com.NullPointer.Models.Member.Engineer;
import com.NullPointer.Models.Member.User;
import com.NullPointer.Models.Member.UserLogInfo;
import com.NullPointer.Service.MemberService.IUserService;
import com.NullPointer.Utils.NpUtil;
import com.NullPointer.Utils.RedisUtil;
import com.NullPointer.Utils.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.SerializationUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aaron on 11/18/16.
 * Email: aaronyang.memory@gmail.com
 */

@Controller
public class IndexController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage() {
//        return "html/index.html";
        return null;
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
//        return "html/login.html";
        return null;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody User user) {
        UserLogInfo resultUser = userService.login(user);
        if (resultUser!=null) {
            return NpUtil.requestMap(resultUser);
        }else {
//            return "html/signup.html";
            return null;
        }
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signup(@RequestBody User user) {
        User resultUser =  userService.signUp(user);
        if (resultUser!=null) {
//            return "html/profile.html";
            return null;
        }else {
//            return "html/signup.html";
            return null;
        }
    }

    @RequestMapping(value = "/documentation",method = RequestMethod.GET)
    public String documentation(){
//        return "Documentation/Documentation.html";
        return null;
    }
}
