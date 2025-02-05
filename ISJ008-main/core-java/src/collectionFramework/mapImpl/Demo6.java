package collectionFramework.mapImpl;

import java.util.HashMap;
import java.util.Map;

public class Demo6 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("A", 20);
        System.out.println(map);
    }
}
