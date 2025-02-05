package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;

public class StudentController {
    StudentService studentService = new StudentService();
    public void createStudent(Student student){
        studentService.createStudent(student);
    }
    public void updateStudent(Student student){
        studentService.updateStudent(student);
    }
}
