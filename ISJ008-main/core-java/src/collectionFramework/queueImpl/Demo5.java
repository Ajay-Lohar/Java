package collectionFramework.queueImpl;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo5 {
    public static void main(String[] args) {
        Comparator<Employee> comparator = (e1,e2)->e1.getSalary()-e2.getSalary();
        Queue<Employee> employeeQueue = new PriorityQueue<>(comparator);

        Employee employee1 = new Employee(2, "Durwang", 999999, "Pune");
        Employee employee2 = new Employee(102, "Adarsh", 100000, "Mumbai");
        Employee employee3 = new Employee(1, "Pratik", 5500, "Nashik");
        Employee employee4 = new Employee(11, "Komal", 87500, "Goa");
        Employee employee5 = new Employee(5, "Prathmesh", 56000, "Washi");
        Employee employee6 = new Employee(3, "Durwang", 8787, "Pune");

        employeeQueue.add(employee1);
        employeeQueue.add(employee2);
        employeeQueue.add(employee3);
        employeeQueue.add(employee4);
        employeeQueue.add(employee5);
        employeeQueue.add(employee6);

        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());

    }
}
