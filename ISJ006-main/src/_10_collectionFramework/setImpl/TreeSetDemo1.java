package _10_collectionFramework.setImpl;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        Set set = new TreeSet();
       set.add("Rohan");
       set.add("Rohan");
       set.add("Adnan");
       set.add("Adnan");
       set.add("Swapnil");
       set.add("Swapnil");
       //set.add(null);
       set.add("Lalit");
       set.add("Lalit");
        System.out.println(set);
    }
}
