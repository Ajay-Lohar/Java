package com.itshaala.spring16webservicesspringboot.dao;

import com.itshaala.spring16webservicesspringboot.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course, Integer> {

}
