package com.james.demoeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class DemoEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaClientApplication.class, args);
    }
    @RequestMapping("/client")
    public String client (){
        return "Client Successful!";
    }
}
