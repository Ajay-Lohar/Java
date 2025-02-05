package collectionFramework.queueImpl;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo4 {
    public static void main(String[] args) {
        Comparator<String> comparator = (s1, s2) -> s1.length() - s2.length();
        Queue<String> ticketQueue = new PriorityQueue<>(comparator);
        ticketQueue.add("Komal");
        ticketQueue.add("Prathamesh");
        ticketQueue.add("Pratik");
        ticketQueue.add("Navid");
        ticketQueue.add("Don");

        System.out.println(ticketQueue.poll());
        System.out.println(ticketQueue.poll());
        System.out.println(ticketQueue.poll());
        System.out.println(ticketQueue.poll());
        System.out.println(ticketQueue.poll());
        System.out.println("Queue size is " + ticketQueue.size());
    }
}
