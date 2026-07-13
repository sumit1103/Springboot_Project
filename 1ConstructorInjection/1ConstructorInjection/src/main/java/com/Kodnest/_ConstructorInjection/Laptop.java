package com.Kodnest._ConstructorInjection;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public void build() {
        System.out.println("Built the application using Laptop");
    }
}