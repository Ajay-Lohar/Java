package classComponents.methods.productMgmt;

import classComponents.methods.productMgmt.controller.ProductController;
import classComponents.methods.productMgmt.model.Product;

public class ProductApp {
    public static void main(String[] args) {
        ProductController productController = new ProductController();

        Product product = new Product();
        product.productId = 101;
        product.productName = "Laptop";
        product.productPrice=  1990;

        productController.addProduct(product);
    }
}
