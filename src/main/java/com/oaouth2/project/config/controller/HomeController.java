package com.oaouth2.project.config.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String getHomePage(Authentication authentication) {
        System.out.println(authentication);
        System.out.println(authentication.getPrincipal());
        return "Welcome to home page!";
    }
    
}
