package com.itshaala.controller;

import com.itshaala.service.CourseService;

public class CourseController {

    //dependency
    CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    //dependency injection

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
