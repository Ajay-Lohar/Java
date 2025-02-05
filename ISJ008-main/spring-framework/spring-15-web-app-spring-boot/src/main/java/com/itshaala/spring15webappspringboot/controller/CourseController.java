package com.itshaala.spring15webappspringboot.controller;

import com.itshaala.spring15webappspringboot.model.Course;
import com.itshaala.spring15webappspringboot.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class CourseController {
    CourseService courseService;

    @RequestMapping("/courses")
    public ModelAndView addCourse(@ModelAttribute Course course) {
        courseService.addCourse(course);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("courses");
        return modelAndView;
    }

}
