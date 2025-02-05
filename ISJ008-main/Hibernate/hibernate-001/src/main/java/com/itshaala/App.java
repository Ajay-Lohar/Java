package com.itshaala;

import com.itshaala.controller.CourseController;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
       /* Course course = Course.builder()
                .courseId(2)
                .courseName("Hibernate in one day - updated")
                .courseDescription("practical and hands on class")
                .coursePrice(1000)
                .build();
        courseController.deleteCourse(course);*/
        System.out.println(courseController.getCourse(53));
    }
}
