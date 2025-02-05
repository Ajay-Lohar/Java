package com.itshaala;

import com.itshaala.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-bean-cfg.xml");
        Course course1 = context.getBean(Course.class);
        Course course2 = context.getBean(Course.class);
        System.out.println(course1.hashCode());
        System.out.println(course2.hashCode());
    }
}
