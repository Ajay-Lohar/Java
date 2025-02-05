package com.itshaala.service;

import com.itshaala.dao.ProductDao;
import com.itshaala.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor
public class ProductService {

    //@Autowired
    ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void addProduct(Product product) {
        productDao.addProduct(product);
    }
}
