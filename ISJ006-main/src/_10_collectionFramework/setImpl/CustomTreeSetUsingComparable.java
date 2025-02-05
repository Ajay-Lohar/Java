package _10_collectionFramework.setImpl;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CustomTreeSetUsingComparable {
    public static void main(String[] args) {
        //Comparator<Employee> comparator = (emp1, emp2) -> emp1.getId() - emp2.getId();
        Comparator<Employee> comparator = Comparator.comparingInt(Employee::getId);
        Employee employee1 = new Employee(11, "Adnan", 19999);
        Employee employee2 = new Employee(1, "Adnan", 19999);
        Employee employee3 = new Employee(23, "Adnan", 19999);
        Employee employee4 = new Employee(101, "Adnan", 19999);
        Employee employee5 = new Employee(4, "Adnan", 19999);

        Set<Employee> employeeSet = new TreeSet<>(comparator);
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);

        employeeSet.forEach(System.out::println);
    }
}
