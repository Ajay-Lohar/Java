package com.itshaala;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Component
public class Product {
    private int productId;
    private String productName;
    private int productPrice;
}
