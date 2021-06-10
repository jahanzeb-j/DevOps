package com.example.devops.jahanzeb.controller;

import com.example.devops.jahanzeb.model.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/")
    public String user()
    {
        return "Hello User !!";
    }

    @GetMapping("/new")
    public ResponseEntity<?> newChange()
    {
        UserEntity user = new UserEntity();
        user.setUsid("1");
        user.setUsername("jazi");
        user.setPassword("243nnsdjsdd32k432dsdhd");
        return ResponseEntity.ok(user);
    }

}
