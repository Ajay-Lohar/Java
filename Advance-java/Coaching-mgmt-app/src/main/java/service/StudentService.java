package service;

import dao.StudentDao;
import model.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentService {
    StudentDao studentDao = new StudentDao();
    public void addStudent(Student student) throws SQLException {
      studentDao.addStudent(student);
    }
    public void editStudent(Student student) throws SQLException {
      studentDao.editStudent(student);
    }
    public void deleteStudent(Student student) throws SQLException {
        studentDao.deleteStudent(student);
    }
    public List<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }
    public Student getStudentById(int id) throws SQLException {
        return studentDao.getStudentById(id);
    }
    public List<Student>getStudentByNameOrPhoneOrEmailOrAddress(String input){
        return studentDao.getStudentByNameOrPhoneOrEmailOrAddress(input);
    }




}
