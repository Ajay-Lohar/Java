package _10_collectionFramework.setImpl;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo3 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("string value");
        set.add("string value");
        set.add(100);
        set.add(100);
        set.add(true);
        set.add(true);
        set.add(null);
        set.add(null);
        System.out.println("Before removal");
        System.out.println(set);

        set.clear();
        System.out.println("After removal");
        System.out.println(set);
    }
}
