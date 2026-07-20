package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @GetMapping("/employee")
    public String showForm() {
        return "index";
    }

    @PostMapping("/salary")
    public String calculateSalary(
            @RequestParam int id,
            @RequestParam String name,
            @RequestParam double basic,
            @RequestParam double hra,
            @RequestParam double bonus,
            Model model) {

        double grossSalary = basic + hra + bonus;

        model.addAttribute("id", id);
        model.addAttribute("name", name);
        model.addAttribute("basic", basic);
        model.addAttribute("hra", hra);
        model.addAttribute("bonus", bonus);
        model.addAttribute("grossSalary", grossSalary);

        return "result";
    }
}