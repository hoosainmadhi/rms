package com.madhis.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/messages")
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Spring+Vue";
    }
}
