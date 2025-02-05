package _10_collectionFramework.list.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Rohit");
        list.add("Swapnil");
        list.add("Onkar");
        list.add("Akshay");
        list.add("Adnan");
        list.add("Roshni");
        list.add("Dipika");

        Collections.sort(list);

        list.forEach(System.out::println);

    }
}
