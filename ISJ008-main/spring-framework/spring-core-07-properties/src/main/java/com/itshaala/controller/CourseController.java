package com.itshaala.controller;

import com.itshaala.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class CourseController {

    //automatic dependency
    //@Autowired
    private CourseService courseService;

    public void addCourse() {
        courseService.addCourse();
    }

    public void updateCourse() {
        courseService.updateCourse();
    }

    public void deleteCourse() {
        courseService.deleteCourse();
    }

    public void getCourse() {
        courseService.getCourse();
    }
}
