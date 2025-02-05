package collectionFramework.listImpl;

import java.util.ArrayList;

public class Demo9RemoveSingleElement {
    public static void main(String[] args) {
        ArrayList integerArrayList = new ArrayList<>();
        integerArrayList.add(100);
        integerArrayList.add(200);
        integerArrayList.add(300);
        integerArrayList.add(400);
        integerArrayList.add("abc");


        //integerArrayList.remove(100);//IndexOutOfBoundsException
        integerArrayList.remove(0);//index
        integerArrayList.remove("abc"); //element
        System.out.println(integerArrayList);
    }
}
