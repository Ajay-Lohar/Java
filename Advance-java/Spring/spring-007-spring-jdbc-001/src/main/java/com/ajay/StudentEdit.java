package com.ajay;

import com.ajay.Configration.SpringCfg;
import com.ajay.controller.StudentController;
import com.ajay.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentEdit {

        public static void main(String[] args) {

            Student student = Student.builder()
                    .id(1)
                    .name("Ajay Lohar")
                    .age(23)
                    .email("loharajay0019@gmail.com")
                    .build();

            ApplicationContext context = new AnnotationConfigApplicationContext(SpringCfg.class);
            StudentController studentController = context.getBean(StudentController.class);
            studentController.editStudent(student);

        }
}
//4136
