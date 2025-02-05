package _10_collectionFramework.list.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(1);
        list.add(11);
        list.add(12);

        Collections.sort(list);
        list.forEach(System.out::println);

    }
}
