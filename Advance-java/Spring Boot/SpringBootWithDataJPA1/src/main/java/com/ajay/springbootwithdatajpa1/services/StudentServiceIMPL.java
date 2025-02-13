package com.ajay.springbootwithdatajpa1.services;

import com.ajay.springbootwithdatajpa1.entities.Student;
import com.ajay.springbootwithdatajpa1.repositery.StudentRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceIMPL implements StudentService {

    @Autowired
    private StudentRepositery studentRepositery;

    @Override
    public boolean addStudentDetails(Student std) {

        boolean status =false;

        try {
            studentRepositery.save(std);
            status = true;
        } catch (Exception e) {
            e.printStackTrace();
            status = false;

        }
        return status;
    }

    @Override
    public List<Student> getAllStudentDetails() {

        return studentRepositery.findAll();
    }

    @Override
    public Student getStudentDetails(long id) {
        Optional<Student> optional =studentRepositery.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        else {
            return null;
        }
    }

    @Override
    public boolean updateStudentDetails(long id,float marks) {
        Student student = getStudentDetails(id);
        if (student != null) {
            student.setMarks(marks);
            studentRepositery.save(student);

            return true;

        }else {
            return false;
        }
    }

    @Override
    public boolean deleteStudentDetails(long id) {
        boolean status =false;
        try{
            studentRepositery.deleteById(id);
            status =true;


        }catch (Exception e) {
            e.printStackTrace();
            status = false;
        }
        return status;
    }
}
