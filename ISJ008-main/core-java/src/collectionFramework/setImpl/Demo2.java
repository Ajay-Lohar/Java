package collectionFramework.setImpl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(100);
        set.add(100);
        set.add("string data");
        set.add("abc");
        set.add(200);
        set.add(null);
        set.add(null);
        set.add(null);
        System.out.println(set);
        // unique, heterogeneous, null(1), insertion order is maintained
       // System.out.println(set.get);//GET method is not there
    }
}
