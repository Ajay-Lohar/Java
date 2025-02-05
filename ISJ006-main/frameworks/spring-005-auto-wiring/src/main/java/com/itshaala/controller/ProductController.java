package com.itshaala.controller;

import com.itshaala.model.Product;
import com.itshaala.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
//@AllArgsConstructor
public class ProductController {

    //@Autowired
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void addProduct(Product product){
        productService.addProduct(product);
    }
}
