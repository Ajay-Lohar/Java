package _10_collectionFramework.mapImpl;

import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Onkar", 19999);
        Employee employee2 = new Employee(20, "Swapnil", 89999);
        Employee employee3 = new Employee(2, "Rohit", 123000);
        Employee employee4 = new Employee(30, "Roshni", 89900);
        Employee employee5 = new Employee(40, "Adnan", 1200);
        Employee employee6 = new Employee(40, "Adnan", 1200);
        Employee employee7 = new Employee(40, "Adnan", 1200);

        Comparator<Employee> comparator = (o1, o2) -> o1.getId()-o2.getId();
        Map<Employee, List<String>> employeeListMap = new TreeMap<>(comparator);
        employeeListMap.put(employee1, Arrays.asList("Pune", "Mumbai"));
        employeeListMap.put(employee2, Arrays.asList("Pune", "Mumbai"));
        employeeListMap.put(employee3, Arrays.asList("Pune", "Mumbai"));
        employeeListMap.put(employee4, Arrays.asList("Pune", "Mumbai"));
        employeeListMap.put(employee5, Arrays.asList("Pune", "Mumbai"));
        employeeListMap.put(employee6, Arrays.asList("Pune", "Mumbai"));
        employeeListMap.put(employee7, Arrays.asList("Pune", "Mumbai"));
        employeeListMap.put(employee1, Arrays.asList("Pune", "Mumbai"));
        employeeListMap.put(employee1, Arrays.asList("Pune", "Mumbai"));

        System.out.println("Size of map " + employeeListMap.size());

        employeeListMap.entrySet().forEach(System.out::println);


    }
}
