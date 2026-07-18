package com.example.ecs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ECSController {

    @GetMapping("v1/hello")
    public String hello(){
        return "Hello from AWS ECS";
    }
}
