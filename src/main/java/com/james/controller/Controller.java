package com.james.controller;


import com.james.service.MybatisService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//springboot如果不加如下注解,只会扫描入口类的包极其子包的bean
//需要添加如下注解,指定扫描bean的包
@ComponentScan(basePackages="com.james")
@MapperScan(basePackages = "com.james.dao")
public class Controller {
    @Autowired
    MybatisService mybatisService ;

    @RequestMapping(value = "/helloWorld")
    public String testspringboot(){
        return "HelloWorld";
    }

    @RequestMapping("/queryTime")
    public String queryTime(){
      return  mybatisService.queryTime();
    }

    public static void main(String[] args) {
        SpringApplication.run(Controller.class, args);
    }
}
