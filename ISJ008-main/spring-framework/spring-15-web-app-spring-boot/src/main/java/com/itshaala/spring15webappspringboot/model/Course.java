package com.itshaala.spring15webappspringboot.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Course {
    private int id;
    private String name;
    private String description;
    private int price;
}
