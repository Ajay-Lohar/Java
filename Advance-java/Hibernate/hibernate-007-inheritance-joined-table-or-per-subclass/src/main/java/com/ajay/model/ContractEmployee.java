package com.ajay.model;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

@Entity

public class ContractEmployee extends Employee {

    private double invoiceAmount;
}
