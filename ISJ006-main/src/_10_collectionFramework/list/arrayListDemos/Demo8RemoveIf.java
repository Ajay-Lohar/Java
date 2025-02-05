package _10_collectionFramework.list.arrayListDemos;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo8RemoveIf {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(200);
        arrayList1.add(300);
        arrayList1.add(33);
        arrayList1.add(30);
        arrayList1.add(0, 400);

        System.out.println("before removal operation");
        System.out.println(arrayList1);

        //remove elements based on condition
        Predicate<Integer> predicate = (number) -> number > 100;
        arrayList1.removeIf(predicate);
        System.out.println("after removal operation");
        System.out.println(arrayList1);

    }
}
