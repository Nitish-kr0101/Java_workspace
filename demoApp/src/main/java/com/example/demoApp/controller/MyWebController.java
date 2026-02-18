package com.example.demoApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyWebController {

    @GetMapping("/")
    public String index() {
        return "forward:/index.html";
    }

    @GetMapping("/home")
    public String home() {
        return "forward:/home.html";
    }

    @GetMapping("/aboutus")
    public String aboutus() {
        return "forward:/aboutus.html";
    }

    @GetMapping("/cricket")
    public String cricket() {
        return "forward:/cricket.html";
    }
}
