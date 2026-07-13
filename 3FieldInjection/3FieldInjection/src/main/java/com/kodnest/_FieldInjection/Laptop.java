package com.kodnest._FieldInjection;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public void build() {
        System.out.println("Built the application using Laptop");
    }
}