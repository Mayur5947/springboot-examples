package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcExampleApplication {

    public static void main(String[] args) {
        System.out.println("running");
        System.setProperty("server.servlet.context-path", "/spring-mvc-example");
        SpringApplication.run(SpringMvcExampleApplication.class);
    }

}