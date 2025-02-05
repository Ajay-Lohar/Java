package collectionFramework.setImpl;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo8 {
    public static void main(String[] args) {
        Course course1 = new Course(101, "Full Stack Java", 49999);
        Course course2 = new Course(1, "Full Stack Java", 49999);
        Course course3 = new Course(11, "Full Stack Java", 49999);
        Course course4 = new Course(1010, "Full Stack Java", 49999);
        Course course5 = new Course(22, "Full Stack Java", 49999);

        //TreeSet accepts elements of type comparable
        Set<Course> set = new TreeSet<>();
        set.add(course1);
        set.add(course2);
        set.add(course3);
        set.add(course4);
        set.add(course5);

       set.forEach(System.out::println);
    }

}
