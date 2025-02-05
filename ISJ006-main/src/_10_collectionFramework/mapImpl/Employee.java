package _10_collectionFramework.mapImpl;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee /*implements Comparable<Employee> */{
    private int id;
    private String name;
    private int salary;
/*
    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }*/
}
