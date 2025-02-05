package collectionFramework.mapImpl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo3 {
    public static void main(String[] args) {
        //keys can be : homo, unique, null not even once,
        // sorting order of keys will be maintained

        Map map = new TreeMap();
       /* map.put("Durwang", "Amazon");
        map.put("Durwang", "Amazon");*/
        map.put(100, null);
        map.put(100, null);
     /*   map.put(null, null);
        map.put(null, null);*/
        map.put(455, "Flipkart");
        map.put(67, null);

        System.out.println("size of the map "+map.size());
        System.out.println(map);


    }
}
