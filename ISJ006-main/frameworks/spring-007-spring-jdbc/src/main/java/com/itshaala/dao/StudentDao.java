package com.itshaala.dao;

import com.itshaala.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class StudentDao {

    JdbcTemplate jdbcTemplate;

    public void addStudent(Student student) {
        String query = "insert into student(id,name,email,phone,address) values(?,?,?,?,?)";
        PreparedStatementSetter pss = (ps) -> {
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getPhone());
            ps.setString(5, student.getAddress());
        };
        jdbcTemplate.update(query, pss);
        System.out.println("student record inserted");
    }

    public void updateStudent(Student student) {
        String query = "update student set name=?,email=?,phone=?,address=? where id=?";
        PreparedStatementSetter pss = (ps) -> {
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getPhone());
            ps.setString(4, student.getAddress());
            ps.setInt(5, student.getId());
        };
        jdbcTemplate.update(query, pss);
        System.out.println("student record updated");
    }

    public void deleteStudent(int id) {
        String query = "delete from student where id=?";
        jdbcTemplate.update(query, (ps) -> ps.setInt(1, id));
        System.out.println("student record deleted");
    }

    public List<Student> getAllStudents() {
        String query = "select * from student";
        ResultSetExtractor<List<Student>> resultSetExtractor = rs -> {
            List<Student> students = new ArrayList<>();
            while (rs.next()) {
                Student student = Student.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .email(rs.getString("email"))
                        .phone(rs.getString("phone"))
                        .address(rs.getString("address"))
                        .build();
                students.add(student);
            }
            return students;
        };
        return jdbcTemplate.query(query, resultSetExtractor);
    }
}
