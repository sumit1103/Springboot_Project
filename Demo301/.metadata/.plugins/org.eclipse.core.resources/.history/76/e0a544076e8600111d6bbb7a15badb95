package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Services.EmpService;

@RestController
public class EmpController {

    @Autowired
    EmpService empServ;

    @GetMapping("/getallemp")
    public List<Employee> getAllEmployees() {
        return empServ.getAllEmployees();
    }

    @GetMapping("/getemp/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return empServ.getEmployeeById(id);
    }

    @PostMapping("/insertemp")
    public void insertEmployee(@RequestBody Employee e) {
        empServ.insertEmployee(e);
    }

    @PutMapping("/updateemp/{id}")
    public Employee updateEmployeeById(@PathVariable int id,
                                       @RequestBody Employee e) {
        return empServ.updateEmployeeById(id, e);
    }

    @DeleteMapping("/deleteemp/{id}")
    public void deleteEmployeeById(@PathVariable int id) {
        empServ.deleteEmployeeById(id);
    }
}