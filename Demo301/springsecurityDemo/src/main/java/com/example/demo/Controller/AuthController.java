package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Users;
import com.example.demo.Service.AuthService;

@RestController
public class AuthController {

    @Autowired
    AuthService authServ;

    @GetMapping("/login3")
    public String verify(@RequestParam String name,
                         @RequestParam String password) {

        Users user = authServ.verify(name);

        String uName = user.getName();
        String uPwd = user.getPassword();

        if (name.equals(uName) && password.equals(uPwd)) {

            String uRole = user.getRole();

            if (uRole.equals("Admin")) {
                return "Welcome Admin";
            } else {
                return "Welcome User";
            }

        } else {
            return "Invalid User";
        }
    }
}