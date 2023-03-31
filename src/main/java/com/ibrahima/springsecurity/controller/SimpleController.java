package com.ibrahima.springsecurity.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/private")
    public String getPrivate(Authentication authentication){
        return "I am a private page for"+"["+authentication.getName() +"]";
    }
    @GetMapping
    public String getPublic(){
        return "Hello this page is accessible for everyone";
    }
}
