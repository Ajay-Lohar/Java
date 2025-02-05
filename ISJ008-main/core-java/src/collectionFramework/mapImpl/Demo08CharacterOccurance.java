package collectionFramework.mapImpl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo08CharacterOccurance {
    public static void main(String[] args) {
        String str = "Good morning";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        map.entrySet().forEach(System.out::println);
    }
}
