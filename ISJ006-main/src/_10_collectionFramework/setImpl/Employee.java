package _10_collectionFramework.setImpl;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee /*implements Comparable<Employee>*/ {
    private int id;
    private String name;
    private int salary;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Employee employee = (Employee) obj;
        return this.getId() == employee.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /*@Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }*/
}
