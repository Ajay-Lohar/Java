package com.ajay.springbootwithdatajpa1.services;

import com.ajay.springbootwithdatajpa1.entities.Student;

import java.util.List;

public interface StudentService {
    public boolean addStudentDetails(Student std);
    public List<Student> getAllStudentDetails();
    public Student getStudentDetails(long id);
    public boolean updateStudentDetails(long id,float marks);
    public boolean deleteStudentDetails(long id);
}
