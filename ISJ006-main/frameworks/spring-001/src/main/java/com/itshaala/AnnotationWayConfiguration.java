package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationWayConfiguration {
    public static void main(String[] args) {

        //1. start the spring container
        ApplicationContext applicationContext =
               new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);

        //2. get the reference of created object
        Student student = applicationContext.getBean("student", Student.class);


        System.out.println(student);

    }
}
