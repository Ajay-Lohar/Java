package collectionFramework.setImpl;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo9TreeSetComparator {
    public static void main(String[] args) {
//        Comparator<Employee> comparator = (e1, e2) -> e1.getId() - e2.getId();
        Comparator<Employee> comparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
        Set<Employee> employeeSet = new TreeSet<>(comparator);

        Employee employee1 = new Employee(2, "Durwang", 999999, "Pune");
        Employee employee2 = new Employee(102, "Adarsh", 100000, "Mumbai");
        Employee employee3 = new Employee(1, "Pratik", 5500, "Nashik");
        Employee employee4 = new Employee(11, "Komal", 87500, "Goa");
        Employee employee5 = new Employee(5, "Prathmesh", 56000, "Washi");
        Employee employee6 = new Employee(3, "Durwang", 999999, "Pune");

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);
        employeeSet.add(employee6);

        employeeSet.forEach(System.out::println);
    }
}
