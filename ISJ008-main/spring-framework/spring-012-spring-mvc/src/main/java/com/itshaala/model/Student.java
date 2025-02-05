package com.itshaala.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class Student {
    private int id;
    private String name;
    private int age;
}
