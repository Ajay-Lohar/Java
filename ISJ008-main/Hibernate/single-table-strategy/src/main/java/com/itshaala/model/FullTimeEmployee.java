package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@DiscriminatorValue("full_time_employee")
public class FullTimeEmployee extends Employee {
    @Column(name = "employee_salary")
    private double salary;
}
