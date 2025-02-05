package com.itshaala.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Course {
    private int id;
    private String name;
    private int price;
}
