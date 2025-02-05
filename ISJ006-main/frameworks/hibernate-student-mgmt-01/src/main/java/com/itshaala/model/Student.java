package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "student1")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    @Column(name = "name")
    private String studentName;

    @Column(name = "address")
    private String studentAddress;

    @Column(name = "email")
    private String studentEmail;

    @Column(name = "phone")
    private String studentPhone;

}
