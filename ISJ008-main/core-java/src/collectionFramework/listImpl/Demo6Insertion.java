package collectionFramework.listImpl;

import java.util.ArrayList;

public class Demo6Insertion {
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
        System.out.println(arrayList.toString());//collection reference printing will print elements in square bracket
        arrayList.add(0, "element added at specified index");
        System.out.println(arrayList);

    }
}
