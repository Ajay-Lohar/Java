package _10_collectionFramework.mapImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //map.put("abc",123);//CTE
        map.put(101, "Onkar");
        map.put(102, "Akshay");
        map.put(103, "Rohit");
        map.put(104, "Swapnil");
        map.put(105, "Rahul");
        map.put(106, "Roshni");
        map.put(107, "Deepika");
        System.out.println(map);//reading all data

        Set<Integer> keySet = map.keySet();
        System.out.println("only keys " + keySet);
        Collection<String> values = map.values();
        System.out.println("only values " + values);

        System.out.println("iterating keys only one by one");
        //for loop, enhanced for loop iterator, java 8
        keySet.forEach(System.out::println);


        System.out.println("iterating values only one by one");
        //for loop, enhanced for loop iterator, java 8
        values.forEach(System.out::println);

        //get all entries
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("iterating key-values  one by one");
        //for loop, enhanced for loop iterator, java 8
        entries.forEach(System.out::println);

        System.out.println("printing using for each");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
