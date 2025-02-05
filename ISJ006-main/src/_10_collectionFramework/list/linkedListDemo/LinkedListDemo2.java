package _10_collectionFramework.list.linkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add("abc");
        list.add("xyz");
        list.add(null);
        list.add(null);
        list.add(true);
        System.out.println(list);
        LinkedList list2 = new LinkedList();
        list2.addAll(list);
        System.out.println("list 2");
        System.out.println(list2);

    }
}
