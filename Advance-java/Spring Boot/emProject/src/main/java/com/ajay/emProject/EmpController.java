package com.ajay.emProject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpController {
    List<Employee> employees = new ArrayList<>();

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @PostMapping("employees")
    public String  createEmployee(@RequestBody Employee employee) {
        this.employees.add(employee);
        return "Saved Successfully";
    }

}
