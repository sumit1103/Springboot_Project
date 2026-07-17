package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer {

    @Autowired
    @Qualifier("desktop")
    Computer comp;

    void develop() {

        comp.build();

        System.out.println("Developer has completed the work");

    }

}