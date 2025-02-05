package com.itshaala;

import lombok.*;
import org.springframework.stereotype.Component;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class Student {
    private int id;
    private String name;
    private String address;
}
