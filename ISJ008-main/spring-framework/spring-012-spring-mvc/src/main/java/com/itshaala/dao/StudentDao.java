package com.itshaala.dao;

import com.itshaala.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class StudentDao {
    static List<Student> studentList = new ArrayList<Student>();

    static {
        studentList.add(Student.builder()
                .id(101)
                .name("pk")
                .age(21)
                .build());
    }

    public List<Student> findAll() {
        return studentList;
    }

    public Student findById(int id) {
        return studentList.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }

    public void save(Student student) {
        studentList.add(student);
    }

    public void update(Student student) {
        studentList.add(student);
    }

    public void delete(int id) {
        studentList.removeIf(student -> student.getId() == id);
    }
}
