package com.itshaala;

import com.itshaala.configuration.SpringConfiguration;
import com.itshaala.controller.StudentController;
import com.itshaala.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        StudentController studentController = applicationContext.getBean(StudentController.class);

        Student student = Student.builder()
                .id(9)
                .name("Sony Corporation")
                .email("sony@gmail.com")
                .phone("89898989")
                .address("Mumbai")
                .build();
        //studentController.addStudent(student);
        // studentController.updateStudent(student);
        // studentController.deleteStudent(2);
        studentController.getAllStudents().forEach(System.out::println);
    }
}
