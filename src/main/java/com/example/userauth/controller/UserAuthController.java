package com.example.userauth.controller;

import com.example.userauth.service.UserAuthService;
import com.example.userauth.service.impl.UserAuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAuthController {

    @Autowired
    UserAuthService userAuthService;

    @RequestMapping("/")
    public String userLogin() {



        return "Hello user";
    }

}
