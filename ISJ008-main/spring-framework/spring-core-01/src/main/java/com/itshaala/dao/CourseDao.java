package com.itshaala.dao;

public class CourseDao {

    public CourseDao(){
        System.out.println("course dao constructor");
    }

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
