package collectionFramework.mapImpl;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        //keys can be : homo, hetero, unique, null(1), no insertion order

        Map map = new HashMap();
        map.put("Durwang", "Amazon");
        map.put("Durwang", "Amazon");
        map.put(100, null);
        map.put(100, null);
        map.put(null, null);
        map.put(null, null);
        map.put(455, "Flipkart");
        map.put(67, null);
        System.out.println("size of the map "+map.size());
        System.out.println(map);


    }
}
