package com.example.restaurantdishmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to our restaurant! Use /dishes to manage dishes.";
    }
}
