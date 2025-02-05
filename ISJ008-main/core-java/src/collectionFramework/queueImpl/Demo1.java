package collectionFramework.queueImpl;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args) {
        //First In First Out
        Queue<Integer> queue = new LinkedList<>();

        //insertion -- add, offer
        queue.add(10);
        queue.add(99);
        queue.add(11);
        queue.add(14);
        queue.offer(56);

        //deletion
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.poll());

        System.out.println(queue.poll()); //null
      //  System.out.println(queue.remove()); //NoSuchElementException

        //inspection
        System.out.println(queue.peek());//null
        System.out.println(queue.element());//exception

    }
}
