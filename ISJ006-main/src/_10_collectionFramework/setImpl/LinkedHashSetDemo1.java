package _10_collectionFramework.setImpl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("string value");
        set.add("string value");
        set.add(100);
        set.add(100);
        set.add(true);
        set.add(true);
        set.add(null);
        set.add(null);
        System.out.println(set);
    }
}
