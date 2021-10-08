package com.madhis.rms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/hello")
    public String hello(){
        return "Spring+Vue";
    }
}
