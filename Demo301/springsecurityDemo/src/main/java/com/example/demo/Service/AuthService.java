package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Users;
import com.example.demo.Repository.AuthRepository;

@Service
public class AuthService
{
    @Autowired
    AuthRepository authRepo;

    public Users verify(String name)
    {
        Users user = authRepo.findByName(name);
        return user;
    }
}