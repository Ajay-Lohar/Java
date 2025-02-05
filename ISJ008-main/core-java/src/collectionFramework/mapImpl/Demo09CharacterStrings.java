package collectionFramework.mapImpl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo09CharacterStrings {
    public static void main(String[] args) {
        String str = "Good morning Good afternoon Good evening Good night";
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String string : str.split(" ")) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        map.entrySet().forEach(System.out::println);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println("put all");
        map2.entrySet().forEach(System.out::println);

        System.out.println(map2.getOrDefault("god",0));

    }
}
