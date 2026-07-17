package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/api/{year}")
    @ResponseBody
    public int display(@PathVariable int year) {

        year = year + 5;
        return year;
    }
}