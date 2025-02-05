package _10_collectionFramework.list.arrayListDemos;

import java.util.ArrayList;

public class Demo3AddAll {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList<>();
        arrayList1.add(100);
        arrayList1.add(200);
        arrayList1.add(300);
        arrayList1.add(0, 400);
        arrayList1.add(null);
        arrayList1.add(null);
        arrayList1.add(null);
        arrayList1.add(true);
        arrayList1.add("this is string data");

        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList1);
        arrayList2.add("appended content");
        System.out.println(arrayList1.toString());
        System.out.println(arrayList2.toString());
    }
}
