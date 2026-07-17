package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class Desktop implements Computer {

    @Override
    public void build() {

        System.out.println("Developer is using desktop to build app");

    }

}