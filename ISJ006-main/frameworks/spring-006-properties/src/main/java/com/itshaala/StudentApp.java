package com.itshaala;

import com.itshaala.controller.ProductController;
import com.itshaala.controller.StudentController;
import com.itshaala.model.Product;
import com.itshaala.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class StudentApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
         Student student = new Student();
        StudentController studentController = applicationContext.getBean(StudentController.class);
        studentController.addStudent(student);
    }
}
