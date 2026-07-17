package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PrimaryDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(PrimaryDemoApplication.class, args);

        Developer dev = context.getBean(Developer.class);

        dev.develop();

    }

}