package com.ajay.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity

@DiscriminatorValue("C Type Object")
public class C extends B{

    int m;
    int n;
    int o;
}
