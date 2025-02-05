package _10_collectionFramework.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(1);
        list.add(11);
        list.add(12);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
