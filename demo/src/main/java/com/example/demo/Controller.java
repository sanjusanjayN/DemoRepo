package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Marks this class as a REST controller
@RestController
public class Controller {

    // Maps HTTP GET requests to this method
    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Welcome to my world";
    }
}