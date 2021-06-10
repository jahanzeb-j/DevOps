package com.example.devops.jahanzeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

    @RequestMapping("/")
    public  String runindex(){
        return "index.html";
    }

}
