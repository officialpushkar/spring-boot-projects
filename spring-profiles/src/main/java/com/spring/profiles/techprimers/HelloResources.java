package com.spring.profiles.techprimers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResources {

    @Value("${spring.message}")
    private String message;

    @GetMapping("/hello")
    public String hello(){
        return message;
    }

}
