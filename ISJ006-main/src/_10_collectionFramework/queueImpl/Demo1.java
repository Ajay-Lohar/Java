package _10_collectionFramework.queueImpl;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        //deletion
        System.out.println(queue.poll());//null
        //System.out.println(queue.remove());//ex

        //inspection
        System.out.println("Who is next?"+queue.peek());//null
        //System.out.println("Who is next?"+queue.element());//ex

        //insertion
        System.out.println(queue.add(100));//ex
        System.out.println(queue.offer(200));//null

    }
}
