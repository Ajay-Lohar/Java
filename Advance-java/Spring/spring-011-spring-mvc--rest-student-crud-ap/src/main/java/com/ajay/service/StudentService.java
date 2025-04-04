package com.ajay.service;

import com.ajay.dao.StudentDao;
import com.ajay.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {

    private StudentDao studentDao;

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }
    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

}
