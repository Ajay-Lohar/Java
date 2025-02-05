package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;

import java.util.List;

public class StudentService {
    StudentDao studentDao = new StudentDao();

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void updateStudent(Student student) {
    }

    public void deleteStudent(int studentId) {
    }

    public Student getStudentById(int studentId) {
        return null;
    }

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
