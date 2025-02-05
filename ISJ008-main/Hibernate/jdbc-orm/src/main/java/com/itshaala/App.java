package com.itshaala;

import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the course id");
        int courseId = scanner.nextInt();

        System.out.println("Enter the course name");
        String courseName = scanner.next();

        System.out.println("Enter the course price");
        int coursePrice = scanner.nextInt();

        Course course = Course.builder()
                .id(courseId)
                .name(courseName)
                .price(coursePrice)
                .build();

        CourseController  courseController = new CourseController();
        courseController.updateCourse(course);

    }
}
