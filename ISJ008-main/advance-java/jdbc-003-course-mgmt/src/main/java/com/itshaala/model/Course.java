package com.itshaala.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Course {
    private int id;
    private String name;
    private String description;
    private int price;
}
