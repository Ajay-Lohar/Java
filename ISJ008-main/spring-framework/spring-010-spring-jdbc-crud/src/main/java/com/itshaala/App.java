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
        CourseController controller = (CourseController) context.getBean("courseController");
        Course course = Course.builder()
                .name("spring jdbc quick")
                .description("develop app in 1o minutes")
                .price(1000)
                .build();
        controller.addCourse(course);


    }

}
