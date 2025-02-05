package com.itshaala.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Event {
    private int id;
    private String name;
    private String description;
    private String date;
}
