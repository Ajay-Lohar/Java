package _10_collectionFramework.queueImpl;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo4 {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        queue.add(10);
        queue.add(101);
        queue.add(1);
        queue.add(11);
        queue.add(23);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
