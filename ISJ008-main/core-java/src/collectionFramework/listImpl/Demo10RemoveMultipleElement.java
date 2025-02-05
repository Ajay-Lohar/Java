package collectionFramework.listImpl;

import java.util.ArrayList;

public class Demo10RemoveMultipleElement {
    public static void main(String[] args) {
        ArrayList integerArrayList = new ArrayList<>();
        integerArrayList.add(100);
        integerArrayList.add(200);
        integerArrayList.add(300);
        integerArrayList.add(400);
        integerArrayList.add("abc");

        ArrayList removalList = new ArrayList();
        removalList.add(100);
        removalList.add(400);

        System.out.println(integerArrayList);
        integerArrayList.removeAll(removalList);
        System.out.println(integerArrayList);

        //remove all
        integerArrayList.clear();
        System.out.println(integerArrayList);
    }
}
