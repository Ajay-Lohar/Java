package com.itshaala.dao;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
@PropertySource("classpath*:application.properties")
public class CourseDao {
    Environment environment;

    public void addCourse() {
        System.out.println("url " + environment.getProperty("url"));
        System.out.println("username " + environment.getProperty("db-username"));
        System.out.println("password " + environment.getProperty("db-password"));
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
