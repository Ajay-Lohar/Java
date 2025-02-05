package com.itshaala.spring16webservicesspringboot.controller;

import com.itshaala.spring16webservicesspringboot.model.Course;
import com.itshaala.spring16webservicesspringboot.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@AllArgsConstructor
public class CourseController {
    CourseService courseService;

    @PostMapping
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

    @DeleteMapping
    public void deleteCourse(@RequestBody Course course) {
        courseService.deleteCourse(course);
    }

    @PutMapping
    public void updateCourse(@RequestBody Course course) {
        courseService.updateCourse(course);
    }

    @GetMapping("/{id}")
    public Course getCourse(@PathVariable int id) {
        return courseService.findByCourseId(id);
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
