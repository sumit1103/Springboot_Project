package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Mycontroller {	
	@GetMapping("/api/{year}")
	public String display(@PathVariable int year, Model m) {
		year = year + 5;
		m.addAttribute("data", year);
		return "index";
	}

}
