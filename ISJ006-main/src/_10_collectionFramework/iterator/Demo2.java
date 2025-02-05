package _10_collectionFramework.iterator;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(1);
        list.add(11);
        list.add(12);

        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }
    }
}
