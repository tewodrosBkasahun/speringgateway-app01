package com.spring.gateway.app_basic_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.spring.gateway.app_basic_01")
public class AppBasic01Application {

    public static void main(String[] args) {
        SpringApplication.run(AppBasic01Application.class, args);
    }

}
