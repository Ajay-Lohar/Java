package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
@Embeddable
public class Address {
    private String street;
    private String city;
    private String state;
    private int zip;
}
