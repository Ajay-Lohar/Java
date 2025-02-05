package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Generated;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
@Entity
@Table(name = "employee_tbl")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int id;

    @Column(name = "employee_name")
    private String name;

    @Column(name = "employee_salary")
    private int salary;

    @Embedded
    private Address address;
}
