package com.itshaala.spring013studentmgmtspringboot.controller;

import com.itshaala.spring013studentmgmtspringboot.model.Student;
import com.itshaala.spring013studentmgmtspringboot.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {
    StudentService studentService;

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }


    @PutMapping("/students")
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }


    @DeleteMapping("/students")
    public void deleteStudent(@RequestBody Student student) {
        studentService.deleteStudent(student);
    }


    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable("id") int id) {
        studentService.deleteStudentById(id);
    }


    @GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        System.out.println(students);
        return students;
    }


    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        Student student = studentService.getStudentById(id);
        System.out.println(student);
        return student;
    }

    @GetMapping("/students/filter/{name}")
    public List<Student> getStudentByName(@PathVariable("name") String name) {
        return studentService.findStudentsByName(name);
    }

    @GetMapping("/students/filter/address")
    public List<Student> getStudentByNameAndAddress(@RequestParam("name") String name, @RequestParam("address") String address) {
        return studentService.findStudentByNameContainingOrAddressContaining(name, address);
    }
}
