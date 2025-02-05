package _10_collectionFramework.setImpl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo5 {
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

        System.out.println("Get single element "+set);
        System.out.println("is null present "+set.contains(null));

        System.out.println("read all elements");
        set.forEach(System.out::println);

        System.out.println("read all elements using iterator");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
