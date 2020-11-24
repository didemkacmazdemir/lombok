package com.didem.lombok.controller;

import com.didem.lombok.model.User;
import com.didem.lombok.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public String deneme(){

        userService.hi();
        return "";
    }
}
