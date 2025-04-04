package com.ajay.crudoperation.controller;

import com.ajay.crudoperation.entities.Students;
import com.ajay.crudoperation.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    @CrossOrigin(origins = "http://localhost:5173")
    public Students addStudent(@RequestBody Students students) {
        return studentService.addStudent(students);
    }

    @GetMapping("/getStudents")
    @CrossOrigin(origins = "http://localhost:5173")
    public List<Students> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/updateStudent")
    @CrossOrigin(origins = "http://localhost:5173")
    public Students updateStudent(@RequestBody Students students) {
        return studentService.updateStudent(students);

    }

    @GetMapping("/deleteStudent/{id}")
    @CrossOrigin(origins = "http://localhost:5173")
    public boolean deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);

    }

}
