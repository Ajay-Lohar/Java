package com.ajay.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString


@DiscriminatorValue("ftf")
@Entity
public class FullTimeEmployee extends Employee {
    private double salary;

}
