package _10_collectionFramework.list.arrayListDemos;

import java.util.ArrayList;
import java.util.Collections;

public class Demo11Sorting {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Adnan");
        list.add("Akshay");
        list.add("Onkar");
        list.add("Swapnil");
        list.add("Rohit");
        list.add("Roshni");
        list.add("Dipika");
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
