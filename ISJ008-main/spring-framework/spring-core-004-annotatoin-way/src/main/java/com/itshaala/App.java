package com.itshaala;

import com.itshaala.config.SpringBeanConfig;
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
        Course course1 = context.getBean("courseBean", Course.class);
        Course course2 = context.getBean("courseBean", Course.class);
        System.out.println(course1 + "\t" + course1.hashCode());
        System.out.println(course2 + "\t" + course2.hashCode());
    }
}
