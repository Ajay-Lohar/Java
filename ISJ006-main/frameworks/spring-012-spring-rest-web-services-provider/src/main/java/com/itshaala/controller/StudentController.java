package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {
    StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public Student findStudentById(@PathVariable("id") int id) {
        return studentService.findStudentById(id);
    }

    @RequestMapping(value = "/students/filter", method = RequestMethod.GET)
    public List<Student> findByNameAndAddress(@RequestParam(name = "name") String name,
                                              @RequestParam(name = "address") String address) {
        return studentService.findByNameAndAddress(name, address);
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Student Added Successfully";
    }


}