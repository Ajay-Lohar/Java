package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Data
@Entity
@Table(name = "full_time_employee_tbl")
public class FullTimeEmployee extends Employee {
    @Column(name = "employee_salary")
    private double salary;
}
