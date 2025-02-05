package classComponents.methods.productMgmt.dao;

import classComponents.methods.productMgmt.model.Product;

public class ProductDao {
    public void addProduct(Product product) {
        System.out.println(product.productId);
        System.out.println(product.productName);
        System.out.println(product.productPrice);
    }
}