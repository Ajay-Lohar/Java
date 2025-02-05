package com.itshaala.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "contract_employee_tbl")
public class ContractEmployee extends Employee {
    @Column(name = "invoice_amount")
    private double invoice_amount;
}
