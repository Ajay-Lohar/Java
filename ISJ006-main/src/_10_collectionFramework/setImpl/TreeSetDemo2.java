package _10_collectionFramework.setImpl;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(10);
        set.add(97);
        set.add(97);
        set.add(56);
        set.add(88);
        set.add(67);
        System.out.println(set);
    }
}
