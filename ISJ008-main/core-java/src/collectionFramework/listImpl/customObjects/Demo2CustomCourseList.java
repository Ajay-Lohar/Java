package collectionFramework.listImpl.customObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2CustomCourseList {
    public static void main(String[] args) {
        Course course1 = new Course(101, "Full Stack Java", 49999);
        Course course2 = new Course(1, "Backend Python Developer", 44999);
        Course course3 = new Course(11, "AI & Data Science", 69999);
        Course course4 = new Course(2, "DevOps", 39999);
        Course course5 = new Course(22, "MERN", 5688);

        List<Course> courseList = new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        courseList.add(course4);
        courseList.add(course5);

        Collections.sort(courseList);

        courseList.forEach(System.out::println);

    }
}
