package com.james.demoeurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${server.port}")
    String port;

    @RequestMapping("/port")
    public String client() {
        return "Port=" + port;
    }
}
