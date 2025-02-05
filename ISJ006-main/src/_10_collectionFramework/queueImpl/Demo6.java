package _10_collectionFramework.queueImpl;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo6 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Adnan", 90000);
        Employee employee2 = new Employee(11, "Swapnil", 8700);
        Employee employee3 = new Employee(2, "Rohit", 12345);
        Employee employee4 = new Employee(22, "Onkar", 12000);
        Employee employee5 = new Employee(3, "Rahul", 1234556);

        Queue<Employee> employeeQueue = new PriorityQueue<>();
        employeeQueue.add(employee1);
        employeeQueue.add(employee2);
        employeeQueue.add(employee3);
        employeeQueue.add(employee4);
        employeeQueue.add(employee5);

        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
    }
}
