package com.ajay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Employee {
    private int id;
    private String name;
    private String age ;
    private double salary;
    private String address;


}
