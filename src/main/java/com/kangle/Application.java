package com.kangle;

//Spring boot工程都有一个启动引导类，这是工程的入口类
//@SpringBootApplication注解包括了很多注解的组合， component scan默认是当前包com.kangle下的所有路径

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
