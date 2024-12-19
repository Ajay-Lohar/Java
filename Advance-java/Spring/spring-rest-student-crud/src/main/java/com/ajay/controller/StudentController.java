package com.ajay.controller;

import com.ajay.model.Student;
import com.ajay.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.net.IDN;

@AllArgsConstructor
@Controller
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    @RequestMapping(method = RequestMethod.POST)    //@PostMapping --> both are same
    public ModelAndView addStudent(@ModelAttribute("student") Student student) {
        studentService.addStudent(student);
        ModelAndView modelAndView = new ModelAndView("student");
        return modelAndView;
    }
    @RequestMapping(method =RequestMethod.GET ,value = "/{id}")
    public ModelAndView getStudentbyId(@PathVariable("id") int id) {
        Student student = studentService.getStudentById(id);

        ModelAndView modelAndView = new ModelAndView("student");
        modelAndView.addObject("student", student);
        return modelAndView;
    }

}
