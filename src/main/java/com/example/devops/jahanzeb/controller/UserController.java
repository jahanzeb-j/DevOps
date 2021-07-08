package com.example.devops.jahanzeb.controller;

import com.example.devops.jahanzeb.model.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger (this.getClass ());

    @RequestMapping("/")
    public String user()
    {

        logger.info ("User controller called");
        return " User Controller !!";
    }

    @GetMapping("/new")
    public ResponseEntity<?> newChange()
    {
        logger.info ("New user called");

        UserEntity user = new UserEntity();
        user.setUsid("1");
        user.setUsername("jazi");
        user.setPassword("243nnsdjsdd32k432dsdhd");
        return ResponseEntity.ok(user);
    }

}
