package _10_collectionFramework.list.arrayListDemos;

import java.util.ArrayList;
import java.util.Collections;

public class Demo13CustomList {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Adnan", 90000);
        Employee employee2 = new Employee(11, "Swapnil", 8700);
        Employee employee3 = new Employee(2, "Rohit", 12345);
        Employee employee4 = new Employee(22, "Onkar", 12000);
        Employee employee5 = new Employee(3, "Rahul", 1234556);

        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        Collections.sort(employeeList);

        employeeList.forEach(System.out::println);
    }
}
