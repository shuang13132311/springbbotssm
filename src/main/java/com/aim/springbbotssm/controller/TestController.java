package com.aim.springbbotssm.controller;

import com.aim.springbbotssm.entity.User;
import com.aim.springbbotssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    /*入口*/
    @RequestMapping("testController")
    public String TestController(){
        String userName = "huang";
        String userPassword = "123";
        System.out.println(userName + userPassword);
        User user = userService.login(userName, userPassword);
        if(user != null){
            System.out.println("执行mapper成功");
            return "index";
        }else {
            return null;
        }

    }


}
