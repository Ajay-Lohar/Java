package _10_collectionFramework.queueImpl;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo3 {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        queue.add("efg");
        queue.add("xyz");
        queue.add("pqr");
        queue.add("mnp");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
