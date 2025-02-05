package com.itshaala;

import com.itshaala.config.BeanConfiguration;
import com.itshaala.controller.CourseController;
import com.itshaala.dao.CourseDao;
import com.itshaala.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfiguration.class);

        CourseController courseController = context.getBean(CourseController.class);
        courseController.addCourse();
        courseController.updateCourse();
        courseController.deleteCourse();
        courseController.getCourse();
    }
}
