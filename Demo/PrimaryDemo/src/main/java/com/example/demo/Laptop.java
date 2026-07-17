package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

    @Override
    public void build() {

        System.out.println("Developer is using laptop to build the app");

    }

}