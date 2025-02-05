package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;

public class StudentService {
    StudentDao studentDao = new StudentDao();

    public void createStudent(Student student) {
        studentDao.createStudent(student);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }
}
