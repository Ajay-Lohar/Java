package com.itshaala.dao;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CourseDao {

    public void addCourse() {
        System.out.println("course added");
    }

    public void updateCourse() {
        System.out.println("course updated");
    }

    public void deleteCourse() {
        System.out.println("course deleted");
    }

    public void getCourse() {
        System.out.println("course fetched");
    }
}
