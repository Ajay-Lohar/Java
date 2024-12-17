package com.ajay;

import com.ajay.Configration.SpringCfg;
import com.ajay.controller.StudentController;
import com.ajay.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDelete {

        public static void main(String[] args) {

            Student student = Student.builder()
                    .id(5)
                    .build();
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringCfg.class);
            StudentController studentController = context.getBean(StudentController.class);
            studentController.deleteStudent(student);

        }
}

