package _10_collectionFramework.iterator;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(1);
        list.add(11);
        list.add(12);

       // Consumer<Integer> consumer = (number) -> System.out.println(number);
        Consumer<Integer> consumer = System.out::println;
        list.forEach(consumer);
    }
}
