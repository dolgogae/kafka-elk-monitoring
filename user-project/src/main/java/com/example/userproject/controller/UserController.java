package com.example.userproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j(topic = "elk")
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getUser(){
        return "user";
    }
}
