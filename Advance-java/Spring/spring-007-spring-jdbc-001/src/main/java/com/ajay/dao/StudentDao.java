package com.ajay.dao;

import com.ajay.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addStudent(Student student) {
        String sql = "insert into student(id,name,age,email) values(?,?,?,?)";
        PreparedStatementSetter preparedStatementSetter = pss -> {
            pss.setInt(1, student.getId());
            pss.setString(2, student.getName());
            pss.setInt(3, student.getAge());
            pss.setString(4, student.getEmail());
        };
        jdbcTemplate.update(sql, preparedStatementSetter);
        System.out.println("Student added successfully");
    }

    public void editStudent(Student student) {
        String sql = "update student set name=?, age=?, email=? where id=?";
        PreparedStatementSetter preparedStatementSetter = pss -> {
            pss.setString(1, student.getName());
            pss.setInt(2, student.getAge());
            pss.setString(3, student.getEmail());
            pss.setInt(4, student.getId());
        };
        jdbcTemplate.update(sql, preparedStatementSetter);
        System.out.println("Student edited successfully");
    }
    public void deleteStudent(Student student) {
        String sql = "delete from student where id=?";
        PreparedStatementSetter preparedStatementSetter = pss -> {
            pss.setInt(1, student.getId());

        };
        jdbcTemplate.update(sql,preparedStatementSetter);
        System.out.println("Student delete successfully");
    }



}
