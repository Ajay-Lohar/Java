package com.ajay.crudoperation.services;

import com.ajay.crudoperation.entities.Students;
import com.ajay.crudoperation.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Students addStudent(Students student){
        return studentRepo.save(student);
    }
    public List<Students> getAllStudents(){
        return studentRepo.findAll();
    }

    public Students updateStudent(Students updatedStudent){
        Optional<Students> student1 =  studentRepo.findById(updatedStudent.getId());
        Students student = student1.get();
        student.setName( updatedStudent.getName());
        student.setAge( updatedStudent.getAge());
        student.setDept( updatedStudent.getDept());

    return studentRepo.save(student);
    }

    public Boolean deleteStudent(int id){
        studentRepo.deleteById(id);
        return true;
    }

}
