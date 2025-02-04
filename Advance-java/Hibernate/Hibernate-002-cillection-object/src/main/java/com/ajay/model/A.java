package com.ajay.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter


@Entity
@Table(name = "A")

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Object type")
@DiscriminatorValue("A Type Object")
public class A {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int x;
    int y;
    int z;

}
