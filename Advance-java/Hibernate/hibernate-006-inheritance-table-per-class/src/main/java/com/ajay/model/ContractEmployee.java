package com.ajay.model;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class ContractEmployee extends Employee {

    private double invoiceAmount;
}
