package com.itshaala;

import lombok.*;

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
