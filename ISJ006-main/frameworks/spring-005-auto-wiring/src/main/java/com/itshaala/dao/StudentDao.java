package com.itshaala.dao;

import com.itshaala.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    public void addStudent(Student student){
        System.out.println("student added");
    }
}
