package com.itshaala;

import com.itshaala.controller.CourseController;
import com.itshaala.dao.CourseDao;
import com.itshaala.service.CourseService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CourseController courseController = new CourseController(new CourseService(new CourseDao()));
        courseController.addCourse();
        courseController.updateCourse();
        courseController.deleteCourse();
        courseController.getCourse();
    }
}
