package com.example.actiondoker.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class HelloController {
    @Value("${test.name}")
    private String name;

    @GetMapping("/hello")
    public String hello() {

        return "Hello World" + name;
    }
}
