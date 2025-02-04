package com.ajay.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString



@DiscriminatorValue("c2h")
@Entity
public class ContractEmployee extends Employee {
    private double invoiceAmount;
}
