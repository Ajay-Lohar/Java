package collectionFramework.listImpl;

import java.util.ArrayList;

public class Demo7InsertionAll {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        //1. add single element at the end of list --> append
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(200);
        arrayList.add("string data");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add('a');

        //2. add multiple elements at the end
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("second list element");
        arrayList2.addAll(arrayList);
        System.out.println(arrayList2);

        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("third list element");
        System.out.println(arrayList3);
        arrayList3.addAll(0,arrayList2);
        System.out.println(arrayList3);
        System.out.println("size "+arrayList3.size());

    }
}
