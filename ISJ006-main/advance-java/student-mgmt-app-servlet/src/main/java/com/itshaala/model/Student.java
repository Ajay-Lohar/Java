package com.itshaala.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String studentEmail;
    private String studentPhone;
}
