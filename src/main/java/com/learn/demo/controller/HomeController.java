package com.learn.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/message")
    public String getDisplayMessage() {
        return "Welcome to the spring boot application with Azure deployemnt";
    }
}
