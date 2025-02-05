package collectionFramework.setImpl;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Employee /*implements Comparable<Employee>*/ {
    private int id;
    private String name;
    private int salary;
    private String address;

   /* @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }*/
}