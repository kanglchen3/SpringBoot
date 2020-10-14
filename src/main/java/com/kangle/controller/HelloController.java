package com.kangle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController //组合注解，组合了responseBody和controller
public class HelloController {
    @Autowired
    private DataSource dataSource;

//    @RequestMapping
    @GetMapping("/hello")  //相比于requestMapping，就是多了个get的限制
    public String hello(){
        System.out.println("DataSource = " + dataSource);
        return "Hello, springBoot";
    }
}
