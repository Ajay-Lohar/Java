package com.ajay.springbootwithdatajpa1.repositery;

import com.ajay.springbootwithdatajpa1.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositery extends JpaRepository<Student, Long> {

}
