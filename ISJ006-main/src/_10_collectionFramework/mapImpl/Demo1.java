package _10_collectionFramework.mapImpl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "Akshay");
        map.put(null, "Akshay");
        map.put(null, "Akshay");
        map.put("abc", null);
        map.put(2, null);
        map.put("xyz", "Akshay");
        map.put("mnp", "Akshay");
        System.out.println(map);
        System.out.println("Is the key present "+map.containsKey("xyz"));
        System.out.println("Is the Value present "+map.containsKey(null));
        map.clear();
        System.out.println("Size of map "+map.size());
    }
}
