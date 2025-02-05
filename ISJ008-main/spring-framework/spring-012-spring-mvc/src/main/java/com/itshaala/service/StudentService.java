package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentDao studentDao;

    public List<Student> findAll() {
        return studentDao.findAll();
    }

    public Student findById(int id) {
        return studentDao.findById(id);
    }

    public void save(Student student) {
        studentDao.save(student);
    }

    public void update(Student student) {
        studentDao.update(student);
    }

    public void delete(int id) {
        studentDao.delete(id);
    }
}
