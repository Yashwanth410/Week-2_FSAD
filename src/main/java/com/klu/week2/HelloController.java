package com.klu.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api")
    public String hello() {
        return "Week 2 Spring Boot is running successfully!";
    }
}
