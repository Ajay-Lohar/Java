package com.ajay.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder


@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id ;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private int salary;

    @ElementCollection
    @Column(name = "task")
    private List<String> tasks;
}
