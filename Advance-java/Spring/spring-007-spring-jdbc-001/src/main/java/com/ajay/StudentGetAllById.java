package com.ajay;

import com.ajay.Configration.SpringCfg;
import com.ajay.controller.StudentController;
import com.ajay.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class StudentGetAllById {

        public static void main(String[] args) {

            ApplicationContext context = new AnnotationConfigApplicationContext(SpringCfg.class);
            StudentController studentController = context.getBean(StudentController.class);

//            Student student = studentController.getStudentById(3);
//            System.out.println(student);
//            List<Student> studentList = studentController.getAll();
        }
}
//4136
