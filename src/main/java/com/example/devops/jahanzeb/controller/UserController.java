package com.example.devops.jahanzeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class UserController {

    @RequestMapping("/")
    public  String runindex(){
        return "index.html";
    }

    @RequestMapping("/user")
    @ResponseBody
    String user()
    {
        return "Hello User !!";
    }

}
