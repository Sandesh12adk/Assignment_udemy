package com.example.first;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/sayhello")
    public String sayHello() {
        String message = "Hello Spring Boot <br> Hi I am spring boot!";
        return message;
    }
}
