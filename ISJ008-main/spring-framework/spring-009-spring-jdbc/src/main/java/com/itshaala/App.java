package com.itshaala;

import com.itshaala.config.SpringBeanConfig;
import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringBeanConfig.class);
        CourseController courseController = context.getBean(CourseController.class);
      /*  Course course = Course.builder()
                .id(6)
                .name("Spring framework master class")
                .description("spring core spring jdbc spring mvc spring rest boot")
                .price(9999)
                .build();*/
        //courseController.deleteCourseById(6);
        courseController.findAll().forEach(System.out::println);

    }
}
