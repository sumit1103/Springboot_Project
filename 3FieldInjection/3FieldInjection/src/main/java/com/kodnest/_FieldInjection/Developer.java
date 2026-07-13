package com.kodnest._FieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {

    @Autowired
    private Laptop laptop;

    public void develop() {
        laptop.build();
        System.out.println("Developer completed the work");
    }
}