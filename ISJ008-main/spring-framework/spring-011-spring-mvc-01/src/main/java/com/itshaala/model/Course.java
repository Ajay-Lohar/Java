package com.itshaala.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class Course {
    private int id;
    private String name;
    private String description;
    private int price;
}
