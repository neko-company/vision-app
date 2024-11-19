package com.nekocompany.visionapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/v1/hello")
    public String sayHello() {
        return "Hello World from Spring Boot!";
    }
}
