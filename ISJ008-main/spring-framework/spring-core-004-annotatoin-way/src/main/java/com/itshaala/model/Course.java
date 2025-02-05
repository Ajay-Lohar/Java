package com.itshaala.model;

import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Component("courseBean")
@Scope("prototype")
public class Course {
    private int id;
    private String name;
    private String description;
    private int price;
}
