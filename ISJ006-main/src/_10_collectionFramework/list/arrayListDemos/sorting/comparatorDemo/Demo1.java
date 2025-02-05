package _10_collectionFramework.list.sorting.comparatorDemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Course> courseList = CourseService.getAllCourses();
        System.out.println("before sorting");
        courseList.forEach(System.out::println);

        //Collections.sort(courseList);
        Comparator<Course> comparator = (course1, course2) -> course1.getCourseId() - course2.getCourseId();
        Collections.sort(courseList, comparator);

        System.out.println("After sorting");
        courseList.forEach(System.out::println);
    }
}
