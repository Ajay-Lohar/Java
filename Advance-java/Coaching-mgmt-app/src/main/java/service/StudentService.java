package service;

import dao.StudentDao;
import model.Student;

import java.sql.SQLException;

public class StudentService {
    StudentDao studentDao = new StudentDao();
    public void addStudent(Student student) throws SQLException {
      studentDao.addStudent(student);
    }

}
