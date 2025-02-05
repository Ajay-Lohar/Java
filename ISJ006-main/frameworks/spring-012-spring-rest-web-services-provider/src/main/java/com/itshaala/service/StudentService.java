package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    StudentDao studentDao;

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student findStudentById(int id) {
        return studentDao.findStudentById(id);
    }

    public List<Student> findByNameAndAddress(String name, String address) {
        return studentDao.findByNameAndAddress(name,address);
    }
}