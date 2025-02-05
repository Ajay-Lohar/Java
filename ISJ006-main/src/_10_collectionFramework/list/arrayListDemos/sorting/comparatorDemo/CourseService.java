package _10_collectionFramework.list.sorting.comparatorDemo;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    public static List<Course> getAllCourses() {
        List<Course> courseList = new ArrayList<>();
        Course course1 = Course.builder()
                .courseId(101)
                .courseName("Full Stack Java")
                .coursePrice(100)
                .courseContent("Core, advance, frameworks")
                .courseDuration(4)
                .build();

        Course course2 = Course.builder()
                .courseId(2)
                .courseName("Backend Java")
                .coursePrice(90)
                .courseContent("Core, advance, frameworks")
                .courseDuration(4)
                .build();
        Course course3 = Course.builder()
                .courseId(102)
                .courseName("Full Stack Python")
                .coursePrice(100)
                .courseContent("Core, advance, django")
                .courseDuration(3)
                .build();
        Course course4 = Course.builder()
                .courseId(12)
                .courseName("Backend Python")
                .coursePrice(43)
                .courseContent("Core, advance, frameworks")
                .courseDuration(2)
                .build();
        Course course5 = Course.builder()
                .courseId(123)
                .courseName("MERN")
                .coursePrice(78)
                .courseContent("Core, advance, frameworks")
                .courseDuration(6)
                .build();

        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        courseList.add(course4);
        courseList.add(course5);
        return courseList;
    }
}
