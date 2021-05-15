package com.example.springrestapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String goHome(){
        return "index.html";
    }

    @GetMapping("/test")
    public String goTest(){
        return "contact.html";
    }

    @GetMapping("/about")
    public String goAbout(){
        return "about.html";
    }
}
