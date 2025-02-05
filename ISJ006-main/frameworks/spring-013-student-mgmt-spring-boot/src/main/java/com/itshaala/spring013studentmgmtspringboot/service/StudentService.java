package com.itshaala.spring013studentmgmtspringboot.service;

import com.itshaala.spring013studentmgmtspringboot.dao.StudentDao;
import com.itshaala.spring013studentmgmtspringboot.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    StudentDao studentDao;

    public void addStudent(Student student) {
        studentDao.save(student);
    }

    public void updateStudent(Student student) {
        studentDao.save(student);
    }

    public void deleteStudent(Student student) {
        studentDao.delete(student);
    }

    public void deleteStudentById(int id) {
        studentDao.deleteById(id);
    }

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    public Student getStudentById(int id) {
        return studentDao.findById(id).get();
    }

    public List<Student> findStudentsByName(String str) {
        return studentDao.findStudentByNameContaining(str);
    }public List<Student> findStudentByNameContainingOrAddressContaining(String name, String address) {
        return studentDao.findStudentByNameContainingOrAddressContaining(name,address);
    }
}
