package _5_classComponents.methods.productAppModified;

public class ProductController {
    ProductService productService = new ProductService();

    public void addProduct(Product product) {
        productService.addProduct(product);
    }
}
