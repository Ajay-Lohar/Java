package _10_collectionFramework.setImpl;

import java.util.HashSet;
import java.util.Set;

public class CustomHashSet {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Adnan",19999);
        Employee employee2 = new Employee(1,"Adnan",19999);
        Employee employee3 = new Employee(1,"Adnan",19999);
        Employee employee4 = new Employee(1,"Adnan",19999);
        Employee employee5 = new Employee(1,"Adnan",19999);

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);

        employeeSet.forEach(System.out::println);
    }
}
