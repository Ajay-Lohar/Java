package com.ajay.controller;

import com.ajay.model.Student;
import com.ajay.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentController {

    @Autowired
    StudentService studentService;

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }
    public void editStudent(Student student) {
        studentService.editStudent(student);
    }
    public void deleteStudent(Student student) {
        studentService.deleteStudent(student);
    }
    public Student getStudentById(int id){return studentService.getStudentById(id);}



}

