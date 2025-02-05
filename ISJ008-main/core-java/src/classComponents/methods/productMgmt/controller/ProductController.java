package classComponents.methods.productMgmt.controller;

import classComponents.methods.productMgmt.model.Product;
import classComponents.methods.productMgmt.service.ProductService;

public class ProductController {
    ProductService productService = new ProductService();

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

}
