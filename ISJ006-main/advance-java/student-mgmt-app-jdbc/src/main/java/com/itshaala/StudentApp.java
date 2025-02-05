package com.itshaala;

import com.itshaala.controller.StudentController;
import com.itshaala.model.Student;

public class StudentApp {
    public static void main(String[] args) {
        Student studentToBeAdded = new Student(12, "Roshni", "Pune", "Roshni@gmail,com", "88888");
        Student studentToBeUpdated = new Student(12, "Roshni", "Pune", "Roshni@gmail.com", "88888");
        StudentController studentController = new StudentController();
         //studentController.addStudent(studentToBeAdded); //CREAT
       // studentController.editStudent(studentToBeUpdated); //UPDATE
        //  studentController.deleteStudent(1); //DELETE
        // System.out.println(studentController.getStudentById(11));
        studentController.getAllStudents().forEach(System.out::println);
    }
}
