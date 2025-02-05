package com.itshaala;

import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        List<Course> courseList =  courseController.findAll();
        courseList.forEach(System.out::println);
    }

    private static void deleteCourseById() {
        CourseController courseController = new CourseController();
        System.out.println("Enter the course id to be deleted");
        Scanner scanner = new Scanner(System.in);
        int courseId = scanner.nextInt();
        courseController.deleteCourseById(courseId);
    }

    private static void updateCourse() {
        CourseController courseController = new CourseController();
        System.out.println("Enter the course id, course name, description and price to be updated");
        Scanner scanner = new Scanner(System.in);
        int courseId = scanner.nextInt();
        String courseName = scanner.next();
        String courseDescription = scanner.next();
        int coursePrice = scanner.nextInt();
        Course course = Course.builder()
                .id(courseId)
                .name(courseName)
                .description(courseDescription)
                .price(coursePrice)
                .build();
        courseController.updateCourse(course);
    }
}
