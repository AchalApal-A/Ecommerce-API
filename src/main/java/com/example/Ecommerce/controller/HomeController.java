package com.example.Ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String Home(){
        return "Ecommerce API is running Successfully!";
    }
}
