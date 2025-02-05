package com.itshaala.dao;

import com.itshaala.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
    public ProductDao() {
        System.out.println("product dao construcrtor");
    }

    public void addProduct(Product product){
        System.out.println("Product added");
    }
}
