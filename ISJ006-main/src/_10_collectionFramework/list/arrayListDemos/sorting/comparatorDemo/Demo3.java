package _10_collectionFramework.list.sorting.comparatorDemo;

import java.util.Collections;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Course> courseList = CourseService.getAllCourses();
        System.out.println("before sorting");
        courseList.forEach(System.out::println);

        //Collections.sort(courseList);
//        Collections.sort(courseList, Comparator.comparingInt(Course::getCoursePrice));
        Collections.sort(courseList, (course1, course2) -> course1.getCourseDuration() - course2.getCourseDuration());

        System.out.println("After sorting");
        courseList.forEach(System.out::println);
    }
}
