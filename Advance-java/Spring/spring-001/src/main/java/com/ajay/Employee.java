package com.ajay;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
}
