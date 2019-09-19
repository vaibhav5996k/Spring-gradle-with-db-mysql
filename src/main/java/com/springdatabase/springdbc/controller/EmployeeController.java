package com.springdatabase.springdbc.controller;
import com.springdatabase.springdbc.model.Employee;
import com.springdatabase.springdbc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value="/saveemp")
    public String saveEmpl(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Data saved";
    }

    @GetMapping(value="/getdata")
    public List<Employee> getData(){
        List<Employee> list= employeeRepository.findAll();
        return list;
    }

    @GetMapping(value="/getdata1/{id}")
    public Optional<Employee> getData1(@PathVariable Integer id){
        Optional<Employee> emp= employeeRepository.findById(id);
        return emp;
    }
}
