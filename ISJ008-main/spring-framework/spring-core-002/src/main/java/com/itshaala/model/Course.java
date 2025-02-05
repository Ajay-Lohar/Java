package com.itshaala.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {
    private int id;
    private String name;
    private String description;
    private int coursePrice;
}
