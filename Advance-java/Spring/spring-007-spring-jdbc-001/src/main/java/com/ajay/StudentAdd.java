package com.ajay;

import com.ajay.Configration.SpringCfg;
import com.ajay.controller.StudentController;
import com.ajay.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentAdd {

        public static void main(String[] args) {

            Student student = Student.builder()
                    .id(2)
                    .name("Kranti  Patil")
                    .age(22)
                    .email("krantip19@gmail.com")
                    .build();
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringCfg.class);
            StudentController studentController = context.getBean(StudentController.class);
            studentController.addStudent(student);

        }
}

