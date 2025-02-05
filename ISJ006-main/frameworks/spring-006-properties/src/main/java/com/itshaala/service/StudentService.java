package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {

   // @Autowired
    StudentDao studentDao;
    public void addStudent(Student student){
        studentDao.addStudent(student);
        System.out.println("student dao value variable "+studentDao.value);
    }
}
