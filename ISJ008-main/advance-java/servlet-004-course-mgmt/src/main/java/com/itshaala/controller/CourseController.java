package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import lombok.SneakyThrows;

import java.util.List;

public class CourseController {
    CourseService courseService = new CourseService();

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    public void updateCourse(Course course) {
        courseService.updateCourse(course);
    }
    public void deleteCourseById(int courseId) {
        courseService.deleteCourseById(courseId);
    }

    public List<Course> findAll() {
        return courseService.findAll();
    }
}