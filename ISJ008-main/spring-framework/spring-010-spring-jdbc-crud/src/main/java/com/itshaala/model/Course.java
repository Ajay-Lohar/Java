package com.itshaala.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class Course {
    private int id;
    private String name;
    private String description;
    private int price;
}
