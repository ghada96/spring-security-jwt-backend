package com.javatechie.jwt.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }
}
