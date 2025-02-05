package collectionFramework.listImpl.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo2Comparator {
    public static void main(String[] args) {
        List<Course> courseList = new LinkedList<>();
        Course course1 = new Course(101, "Full Stack Java", 49999);
        Course course2 = new Course(1, "Backend Python Developer", 44999);
        Course course3 = new Course(11, "AI & Data Science", 69999);
        Course course4 = new Course(2, "DevOps", 39999);
        Course course5 = new Course(22, "MERN", 5688);

        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        courseList.add(course4);
        courseList.add(course5);

       /* class CourseComparator implements Comparator<Course> {
            @Override
            public int compare(Course o1, Course o2) {
                return o1.getId() - o2.getId();
            }
        };
        Comparator<Course> comparator = new CourseComparator();
        Collections.sort(courseList, comparator);*/

        //Collections.sort(courseList, (c1, c2)->c1.getId()-c2.getId());
        //Collections.sort(courseList, Comparator.comparingInt(Course::getId));

        Collections.sort(courseList, (c1, c2)->c1.getPrice()- c2.getPrice());
        courseList.forEach(System.out::println);
    }
}
