package com.ajay.dao;

import com.ajay.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;

@AllArgsConstructor
@Repository
public class StudentDao {

    private JdbcTemplate jdbcTemplate;

    public void addStudent(Student student) {
        String sql = "insert into student(name,email,age) values(?,?,?)";
//        jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getAge());
         PreparedStatementSetter preparedStatementSetter = ps -> {
             ps.setString(1, student.getName());
             ps.setString(2, student.getEmail());
             ps.setInt(3, student.getAge());


        };
        jdbcTemplate.update(sql,preparedStatementSetter );

    }

    public Student getStudentById(int id) {
        String sql = "select * from student where id=?";
        PreparedStatementSetter preparedStatementSetter = ps -> {
            ps.setInt(1, id);
        };
        ResultSetExtractor<Student> resultSetExtractor = rs -> {

            Student student = new Student();
            while (rs.next()) {
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setEmail(rs.getString("email"));
                student.setAge(rs.getInt("age"));
            }
            return student;
        };

        Student student =jdbcTemplate.query(sql,preparedStatementSetter, resultSetExtractor);
        return student;
    }

}
