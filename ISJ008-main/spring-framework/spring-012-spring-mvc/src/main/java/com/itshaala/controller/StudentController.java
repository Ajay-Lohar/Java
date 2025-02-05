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
    private StudentService studentService;

    //1. path variable
    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public ModelAndView findById(@PathVariable("id") int id) {
        Student student = studentService.findById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("findById");
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    //2. request param
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ModelAndView save(@RequestParam("id") int id,
                             @RequestParam("name") String name,
                             @RequestParam("age") int age) {
        Student student = Student.builder()
                .id(id)
                .name(name)
                .age(age).
                build();
        studentService.save(student);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add-student");
        return modelAndView;
    }

    @RequestMapping(value = "/students/all", method = RequestMethod.GET)
    public ModelAndView findAll() {
        List<Student> studentList = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentList", studentList);
        modelAndView.setViewName("findAll");
        return modelAndView;
    }


    //3. ModelAtribute
    @RequestMapping(value = "/students/add", method = RequestMethod.GET)
    public ModelAndView update(@ModelAttribute Student student) {
        studentService.update(student);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("add-student");
        return modelAndView;
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id") int id) {
        studentService.delete(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("findByid");
        return modelAndView;
    }

}
