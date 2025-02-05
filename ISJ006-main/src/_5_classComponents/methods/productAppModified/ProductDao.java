package _5_classComponents.methods.productAppModified;

public class ProductDao {
    public void addProduct(Product product) {
        System.out.println(product.productId);
        System.out.println(product.productName);
        System.out.println(product.productPrice);
        System.out.println(product.productDescription);
        System.out.println(product.productQuantity);
    }
}
