package collectionFramework.queueImpl;

import java.util.LinkedList;
import java.util.Queue;

public class Demo2 {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();
        ticketQueue.add("komal");
        ticketQueue.add("Prathamesh");
        ticketQueue.add("Pratik");
        ticketQueue.add("Navid");

        System.out.println(ticketQueue.peek());
        System.out.println(ticketQueue.poll());
        System.out.println(ticketQueue.poll());
        System.out.println(ticketQueue.poll());
        System.out.println(ticketQueue.poll());
        System.out.println("Queue size is "+ticketQueue.size());
    }
}
