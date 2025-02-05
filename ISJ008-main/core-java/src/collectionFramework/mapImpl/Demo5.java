package collectionFramework.mapImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("durwang", "hongkong");
        map.put("pk", "russia");
        map.put("dharma", "uganda");
        map.put("rohit", "Singapore");
        map.put("sandeep", "goa");
        map.put("nishant", "silicon valley");
        map.put("prashant", "maldives");
        map.put("kalpesh", "greece");
        map.put("ruchita", "vietnam");

        //1. get a particular value
        System.out.println(map.get("pk"));//russia
        System.out.println(map.containsKey("pk"));//true
        System.out.println(map.containsValue("pk"));//false

        //2. get all values only
        Collection<String> values = map.values();
        System.out.println("Only values "+values);

        //3. get all keys only
        Set<String> keySet = map.keySet();
        System.out.println("only keys "+keySet);

        //4. get all entries
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries){
            System.out.println("["+entry.getKey()+"---->\t"+entry.getValue()+"]");
        }

    }
}
