package collectionFramework.mapImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {
        Map<String, String> studentVacationMap = new HashMap<>();
        studentVacationMap.put("durwang", "hongkong");
        studentVacationMap.put("pk", "russia");
        studentVacationMap.put("dharma", "uganda");
        studentVacationMap.put("rohit", "Singapore");
        studentVacationMap.put("sandeep", "goa");
        studentVacationMap.put("nishant", "silicon valley");
        studentVacationMap.put("prashant", "maldives");
        studentVacationMap.put("kalpesh", "greece");
        studentVacationMap.put("ruchita", "vietnam");

        //1. read map
        System.out.println(studentVacationMap);

        //2. for loop
        /*for (int i = 1; i <=studentVacationMap.size(); i++) {
            System.out.println(studentVacationMap.get());
        }*/

        //3. get specific entry
        System.out.println(studentVacationMap.get("durwang"));//value

        //4. all values
        System.out.println("Only values");
        studentVacationMap.values().forEach(System.out::println);

        //5. only keys
        System.out.println("only keys");
        studentVacationMap.keySet().forEach(System.out::println);

        //6. get all entries
        System.out.println("Getting all the entries");
        Set<Map.Entry<String, String>> entries = studentVacationMap.entrySet();
        for (Map.Entry<String, String> entry : entries){
           // System.out.println(entry.getKey()+"\t"+entry.getValue());
            System.out.println(entry);
        }

    }
}
