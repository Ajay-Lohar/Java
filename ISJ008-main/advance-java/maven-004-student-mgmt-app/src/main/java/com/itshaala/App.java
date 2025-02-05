package com.itshaala;

import com.itshaala.controller.StudentController;
import com.itshaala.model.Student;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Student student = Student.builder()
                .id(101)
                .name("Pk")
                .address("Pune")
                .email("abc@gmail.com")
                .gender("M")
                .build();

        StudentController studentController = new StudentController();
        studentController.createStudent(student);
    }
}
