package com.jxl.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecurityApplication {

    public static void main(String[] args) {

        SpringApplication.run(SecurityApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


    @GetMapping("/hello/world")
    public String helloWorld() {
        return "hello world...";
    }
}
