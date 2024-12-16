package com.ajay.service;

import com.ajay.dao.StudentDao;
import com.ajay.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

        @Autowired
        StudentDao studentDao;

        public void addStudent(Student student) {
            studentDao.addStudent(student);
        }
        public void editStudent(Student student) {
            studentDao.editStudent(student);
        }
        public void deleteStudent(Student student) {
            studentDao.deleteStudent(student);
        }




}

