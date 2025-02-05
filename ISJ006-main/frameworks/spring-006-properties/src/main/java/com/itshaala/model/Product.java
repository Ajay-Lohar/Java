package com.itshaala.model;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Product {
    private int productId;
    private String productName;
    private int productPrice;
}
