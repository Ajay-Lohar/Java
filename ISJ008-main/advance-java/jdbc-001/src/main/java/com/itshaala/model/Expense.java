package com.itshaala.model;

import lombok.*;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Expense {
    private int id;
    private String title;
    private int amount;
    private String notes;
    private Date expenseDate;
}
