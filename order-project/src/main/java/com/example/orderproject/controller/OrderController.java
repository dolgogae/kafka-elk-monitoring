package com.example.orderproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j(topic = "elk")
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping
    public String getOrder(){
        log.info("info log");
        log.warn("warning log");
        log.error("error log");
        return "order";
    }
}
