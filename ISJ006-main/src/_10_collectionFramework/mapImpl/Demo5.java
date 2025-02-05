package _10_collectionFramework.mapImpl;

import java.util.Map;
import java.util.TreeMap;

public class Demo5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap();
        map.put(1, "abc");
        map.put(2, "abc");
        map.put(10, "abc");
        map.put(11, "abc");
        map.put(3, "abc");
        map.entrySet().forEach(System.out::println);
    }
}
