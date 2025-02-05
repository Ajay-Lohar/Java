package collectionFramework.listImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Demo17Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(302);
        integerArrayList.add(401);
        integerArrayList.add(502);
        integerArrayList.add(101);
        integerArrayList.add(202);
        integerArrayList.add(602);
        integerArrayList.add(701);
        integerArrayList.add(801);
        Collections.sort(integerArrayList);
        System.out.println(integerArrayList);


    }
}
