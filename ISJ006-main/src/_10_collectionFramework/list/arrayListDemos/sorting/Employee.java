package _10_collectionFramework.list.sorting;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class Employee implements Comparable<Employee> {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;

    @Override
    public int compareTo(Employee employee) {
        // return this.employeeId - employee.employeeId;
        //return this.employeeSalary - employee.employeeSalary;
        return this.employeeName.compareTo(employee.employeeName);
        // emp1.compareTo(emp2);
    }
}
