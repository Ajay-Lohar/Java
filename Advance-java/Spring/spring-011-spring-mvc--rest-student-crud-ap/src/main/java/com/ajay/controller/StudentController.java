package com.ajay.controller;

import com.ajay.model.Student;
import com.ajay.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Student added successfully";
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        Student student = studentService.getStudentById(id);
        return student;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
