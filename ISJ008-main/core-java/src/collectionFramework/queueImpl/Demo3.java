package collectionFramework.queueImpl;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo3 {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new PriorityQueue<>();
        ticketQueue.add("Komal");
        ticketQueue.add("Prathamesh");
        ticketQueue.add("Pratik");
        ticketQueue.add("Navid");

        System.out.println(ticketQueue.poll());
        System.out.println(ticketQueue.poll());
        System.out.println(ticketQueue.poll());
        System.out.println(ticketQueue.poll());
        System.out.println("Queue size is "+ticketQueue.size());
    }
}
