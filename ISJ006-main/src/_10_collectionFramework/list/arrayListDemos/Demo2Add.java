package _10_collectionFramework.list.arrayListDemos;

import java.util.ArrayList;

public class Demo2Add {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(0, 400);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(true);
        arrayList.add("this is string data");

        System.out.println(arrayList.toString());
    }
}
