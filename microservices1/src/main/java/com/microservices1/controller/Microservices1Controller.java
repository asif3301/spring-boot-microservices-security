package com.microservices1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservices1Controller {

    @GetMapping("/message")
    public String getData(){
        return "I am from microservices 1";

    }
}
