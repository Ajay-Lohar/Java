package _10_collectionFramework.setImpl;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {
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
        System.out.println(set);

        Set set2 = new HashSet();
        set2.addAll(set);
        System.out.println("Add All");
        System.out.println(set2);
    }
}
