package _10_collectionFramework.list.arrayListDemos;

import java.util.ArrayList;
import java.util.Collections;

public class Demo12SortingIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(88);
        list.add(56);
        list.add(67);
        list.add(70);
        list.add(93);
        list.add(47);
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
