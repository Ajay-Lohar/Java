package _10_collectionFramework.mapImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Demo6 {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new TreeMap();
        map.put("Swapnil", Arrays.asList(10, 20, 40));
        map.put("Rohit", Arrays.asList(90, 80, 40));
        map.put("Akshay", Arrays.asList(11, 222, 33));
        map.put("Onkar", Arrays.asList(10, 20, 40));
        map.put("Rahul", Arrays.asList(10, 20, 40));
        map.entrySet().forEach(System.out::println);
    }
}
