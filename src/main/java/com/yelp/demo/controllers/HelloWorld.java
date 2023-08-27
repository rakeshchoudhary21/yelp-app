package com.yelp.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("v1/sayhello")
    public String sayHello(){
        return "Hello World!!!";
    }
}
