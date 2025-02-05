package collectionFramework.mapImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo7CustomObjectsAsKey {
    public static void main(String[] args) {
        Map<Course, List<String>> courseListMap = new HashMap<>();

        Course course1 = new Course(101, "Full Stack Java", 49999);
        Course course2 = new Course(101, "Full Stack Java", 49999);

        courseListMap.put(course1, List.of("Durwang", "Pk","Prashant"));
        courseListMap.put(course2, List.of("Komal", "Trupti","Ruchita"));

        System.out.println(courseListMap);
        //{Course(id=101, name=Full Stack Java, price=49999)=[Komal, Trupti, Ruchita]}
    }
}
