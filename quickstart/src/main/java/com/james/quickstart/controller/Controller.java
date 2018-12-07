package com.james.quickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/Hello")
    public String helloWorld() {
        return "Hello World";
    }
}
