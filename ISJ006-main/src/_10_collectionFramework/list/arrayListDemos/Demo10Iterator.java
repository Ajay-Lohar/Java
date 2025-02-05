package _10_collectionFramework.list.arrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo10Iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Adnan");
        list.add("Akshay");
        list.add("Onkar");
        list.add("Swapnil");
        list.add("Rohit");
        list.add("Roshni");
        list.add("Dipika");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
