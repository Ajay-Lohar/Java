package controller;

import model.Student;
import service.StudentService;

import java.sql.SQLException;
import java.util.List;

public class SudentController {
    StudentService studentService = new StudentService();
    public void addStudent(Student student) throws SQLException {
        studentService.addStudent(student);
    }
    public void editStudent(Student student) throws SQLException {
        studentService.editStudent(student);
    }
    public void deleteStudent(Student student) throws SQLException {
        studentService.deleteStudent(student);
    }
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();

    }
    public Student getStudentById(int id) throws SQLException {
        return studentService.getStudentById(id);
    }
    public List<Student>getStudentByNameOrPhoneOrEmailOrAddress(String input){
        return studentService.getStudentByNameOrPhoneOrEmailOrAddress(input);
    }

}
