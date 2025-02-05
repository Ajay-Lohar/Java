package collectionFramework.setImpl;

import java.util.HashSet;
import java.util.Set;

public class Demo7 {
    public static void main(String[] args) {
        Course course1 = new Course(101, "Full Stack Java", 49999);
        Course course2 = new Course(101, "Full Stack Java", 49999);
        Course course3 = new Course(101, "Full Stack Java", 49999);
        Course course4 = new Course(101, "Full Stack Java", 49999);
        Course course5 = new Course(101, "Full Stack Java", 49999);

        Set<Course> set = new HashSet<>();
        set.add(course1);
        set.add(course2);
        set.add(course3);
        set.add(course4);
        set.add(course5);

       set.forEach(System.out::println);
    }

}
