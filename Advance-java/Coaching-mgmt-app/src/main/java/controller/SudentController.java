package controller;

import model.Student;
import service.StudentService;

import java.sql.SQLException;

public class SudentController {
    StudentService studentService = new StudentService();
    public void addStudent(Student student) throws SQLException {
        studentService.addStudent(student);
    }
}
