package _5_classComponents.methods.productApp;

public class ProductController {
    ProductService productService = new ProductService();

    public void addProduct(int productId, String productName, int productPrice, String productDescription, int productQuantity) {
        productService.addProduct(productId, productName, productPrice, productDescription, productQuantity);
    }
}
