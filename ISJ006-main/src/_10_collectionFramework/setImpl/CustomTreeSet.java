package _10_collectionFramework.setImpl;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomTreeSet {
    public static void main(String[] args) {
        Employee employee1 = new Employee(11,"Adnan",19999);
        Employee employee2 = new Employee(1,"Adnan",19999);
        Employee employee3 = new Employee(23,"Adnan",19999);
        Employee employee4 = new Employee(101,"Adnan",19999);
        Employee employee5 = new Employee(4,"Adnan",19999);

        Set<Employee> employeeSet = new TreeSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);

        employeeSet.forEach(System.out::println);
    }
}
