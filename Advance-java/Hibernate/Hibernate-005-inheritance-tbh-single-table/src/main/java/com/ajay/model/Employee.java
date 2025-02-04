package com.ajay.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter


@Entity
@Table(name = "employee")
@DiscriminatorColumn(name = "employee_type")
@DiscriminatorValue("employee")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id ;
    @Column(name = "name")
    String name ;
    @Column(name = "address")
    String address ;
    @Column(name ="designation")
    String designation ;
}
