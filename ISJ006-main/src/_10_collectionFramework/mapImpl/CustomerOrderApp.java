package _10_collectionFramework.mapImpl;

import java.time.LocalDateTime;
import java.util.*;

public class CustomerOrderApp {
    public static void main(String[] args) {
        Map<Customer, List<Order>> customerOrderMap = new LinkedHashMap<>();
        Customer customer1 = new Customer(1, "Onkar", "Pune", 123, "onkar@gmail.com");
        Customer customer2 = new Customer(2, "Rahul", "Mumbai", 123, "onkar@gmail.com");
        Customer customer3 = new Customer(3, "Swapnil", "Hyderabad", 123, "onkar@gmail.com");
        Customer customer4 = new Customer(4, "Deepika", "Pune", 123, "onkar@gmail.com");
        Customer customer5 = new Customer(5, "Rohit", "Pune", 123, "onkar@gmail.com");

        Order order1 = new Order(1, "mobile", 10000, LocalDateTime.now(), 1);
        Order order2 = new Order(2, "pc", 23999, LocalDateTime.now(), 1);
        Order order3 = new Order(3, "laptop", 67778, LocalDateTime.now(), 1);
        Order order4 = new Order(4, "xbox", 123455, LocalDateTime.now(), 1);
        Order order5 = new Order(5, "mouse", 600, LocalDateTime.now(), 1);
        Order order6 = new Order(6, "bag", 1100, LocalDateTime.now(), 1);
        Order order7 = new Order(7, "choclates", 400, LocalDateTime.now(), 1);
        Order order8 = new Order(8, "tab", 23000, LocalDateTime.now(), 1);
        Order order9 = new Order(9, "shoes", 5400, LocalDateTime.now(), 1);
        Order order10 = new Order(10, "camera", 34000, LocalDateTime.now(), 1);

        customerOrderMap.put(customer1, Arrays.asList(order1, order2));
        customerOrderMap.put(customer2, Arrays.asList(order3, order4));
        customerOrderMap.put(customer3, Arrays.asList(order5, order6));
        customerOrderMap.put(customer4, Arrays.asList(order7, order8));
        customerOrderMap.put(customer5, Arrays.asList(order9, order10));

        customerOrderMap.entrySet().forEach(System.out::println);

    }

    private static List<Customer> getCustomerList() {
        Customer customer1 = new Customer(1, "Onkar", "Pune", 123, "onkar@gmail.com");
        Customer customer2 = new Customer(3, "Rahul", "Mumbai", 123, "onkar@gmail.com");
        Customer customer3 = new Customer(2, "Swapnil", "Hyderabad", 123, "onkar@gmail.com");
        Customer customer4 = new Customer(4, "Deepika", "Pune", 123, "onkar@gmail.com");
        Customer customer5 = new Customer(5, "Rohit", "Pune", 123, "onkar@gmail.com");
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);

        return customerList;
    }

    private static List<Order> getOrders() {
        Order order1 = new Order(1, "mobile", 10000, LocalDateTime.now(), 1);
        Order order2 = new Order(2, "pc", 23999, LocalDateTime.now(), 1);
        Order order3 = new Order(3, "laptop", 67778, LocalDateTime.now(), 1);
        Order order4 = new Order(4, "xbox", 123455, LocalDateTime.now(), 1);
        Order order5 = new Order(5, "mouse", 600, LocalDateTime.now(), 1);
        Order order6 = new Order(6, "bag", 1100, LocalDateTime.now(), 1);
        Order order7 = new Order(7, "choclates", 400, LocalDateTime.now(), 1);
        Order order8 = new Order(8, "tab", 23000, LocalDateTime.now(), 1);
        Order order9 = new Order(9, "shoes", 5400, LocalDateTime.now(), 1);
        Order order10 = new Order(10, "camera", 34000, LocalDateTime.now(), 1);
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);
        orders.add(order7);
        orders.add(order8);
        orders.add(order9);
        orders.add(order10);
        return orders;
    }
}
