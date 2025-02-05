package _5_classComponents.methods.productApp;

public class ProductService {
    ProductDao productDao = new ProductDao();

    public void addProduct(int productId, String productName, int productPrice, String productDescription, int productQuantity) {
        productDao.addProduct(productId, productName, productPrice, productDescription, productQuantity);
    }
}
