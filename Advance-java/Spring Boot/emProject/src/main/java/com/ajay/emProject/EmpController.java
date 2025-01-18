package com.ajay.emProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpController {
    EmployeeService employeeService = new EmployeeServiceImpl();


    //Dependency Injection
//    @Autowired
//    EmployeeService employeeService;
    @GetMapping("employees")
    public List<Employee> getAllEmployees()    {
        return employeeService.readEmployees();
    }

    @PostMapping("employees")
    public String  createEmployee(@RequestBody Employee employee) {
//      employees.add(employee);
        return employeeService.createEmployee(employee);

    }
    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        if (employeeService.deleteEmployee(id))
            return "Delete Succesfully";
        return "Not Fount";
    }
}
