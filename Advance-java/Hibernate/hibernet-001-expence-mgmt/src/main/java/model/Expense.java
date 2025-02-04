package model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder

@Entity

@Table(name = "expense_tbl")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    @Column(name = "expense_title")
    private String title;

    @Column(name = "expense_amount")
    private String amount;

    @Column(name = "expense_date")
    private LocalDate date;


}
