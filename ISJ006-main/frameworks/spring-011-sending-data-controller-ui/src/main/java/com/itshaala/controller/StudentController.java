package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentController {
    StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ModelAndView getAllStudents() {
        ModelAndView modelAndView = new ModelAndView();
        List<Student> studentList = studentService.getAllStudents();
        modelAndView.setViewName("getAllStudents");
        modelAndView.addObject("students", studentList);
        return modelAndView;
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public ModelAndView findStudentById(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        Student student = studentService.findStudentById(id);
        modelAndView.setViewName("findStudentById");
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public ModelAndView addStudent(@ModelAttribute Student student) {
        ModelAndView modelAndView = new ModelAndView();
        studentService.addStudent(student);
        modelAndView.setViewName("getAllStudents");
        return modelAndView;
    }

    @RequestMapping(value = "/students/filter", method = RequestMethod.GET)
    public ModelAndView findByNameAndAddress(@RequestParam(name = "name") String name, @RequestParam(name = "address") String address) {
        ModelAndView modelAndView = new ModelAndView();
        List<Student> stdudentList = studentService.findByNameAndAddress(name, address);
        modelAndView.setViewName("getAllStudents");
        modelAndView.addObject("students", stdudentList);
        return modelAndView;
    }

}
