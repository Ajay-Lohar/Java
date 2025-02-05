package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;

import java.util.List;

public class StudentController {

    StudentService studentService = new StudentService();

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    public void editStudent(Student student) {
        studentService.editStudent(student);
    }

    public void deleteStudent(int id) {
        studentService.deleteStudent(id);
    }

    public Student getStudentById(int id) {
        return studentService.getStudentById(id);
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
