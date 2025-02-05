package collectionFramework.listImpl;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo11RemoveIf {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(101);
        integerArrayList.add(202);
        integerArrayList.add(302);
        integerArrayList.add(401);
        integerArrayList.add(502);
        integerArrayList.add(602);
        integerArrayList.add(701);
        integerArrayList.add(801);
        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        System.out.println(integerArrayList);
        integerArrayList.removeIf(predicate);
        System.out.println(integerArrayList);


    }
}
