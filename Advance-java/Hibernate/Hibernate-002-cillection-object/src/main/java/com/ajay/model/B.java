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


@Entity
@DiscriminatorValue("B Type Object")
public class B extends A{
    int p;
    int q;
    int r;
}
