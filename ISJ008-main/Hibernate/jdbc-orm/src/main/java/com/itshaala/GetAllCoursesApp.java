package com.itshaala;

import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class GetAllCoursesApp {
    public static void main(String[] args) {
        CourseController  courseController = new CourseController();
        List<Course> courseList = courseController.getAllCourses();
        courseList.forEach(System.out::println);
    }
}
