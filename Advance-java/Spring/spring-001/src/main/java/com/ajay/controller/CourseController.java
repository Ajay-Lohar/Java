package com.ajay.controller;

import com.ajay.model.Course;
import com.ajay.service.CourseService;

public class CourseController {
    CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }
}
