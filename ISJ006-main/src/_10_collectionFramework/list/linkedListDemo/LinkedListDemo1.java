package _10_collectionFramework.list.linkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add("abc");
        list.add("xyz");
        list.add(null);
        list.add(null);
        list.add(true);
        System.out.println(list);

    }
}
