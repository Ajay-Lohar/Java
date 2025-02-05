package collectionFramework.queueImpl;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Employee /*implements Comparable<Employee>*/ {
    private int id;
    private String name;
    private int salary;
    private String address;

  /*  @Override
    public int compareTo(Employee o) {
        return o.salary-this.salary;
    }*/
}