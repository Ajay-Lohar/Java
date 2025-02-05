package com.itshaala.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@Builder
public class Course {
    private int courseId;
    private String courseName;
    private int coursePrice;
}
