package com.itshaala.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Course {
    private int id;
    private String name;
    private String description;
    private int price;
}
