package collectionFramework.listImpl.customObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1EmployeeCustomList {
    public static void main(String[] args) {
        Employee employee1 = Employee.builder()
                .id(101)
                .name("Durwang")
                .salary(150000)
                .address("Pune")
                .build();
        Employee employee2 = new Employee(102, "Adarsh", 100000, "Mumbai");
        Employee employee3 = new Employee(1, "Pratik", 5500, "Nashik");
        Employee employee4 = new Employee(11, "Komal", 87500, "Goa");
        Employee employee5 = new Employee(5, "Prathmesh", 56000, "Washi");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        //1. iterate list elements
        for (Employee employee : employeeList){
            System.out.println(employee);
        }

        //2. java 8
        System.out.println("before sorting");
        employeeList.forEach(System.out::println);

        //sort employees
        Collections.sort(employeeList);

        System.out.println("After sorting");
        employeeList.forEach(System.out::println);

    }
}
