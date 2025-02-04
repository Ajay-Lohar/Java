package com.ajay.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name ="employee")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "address")
    String address;

    @Column(name = "designation")
    String designation;

}
