package _5_classComponents.methods.productAppModified;

public class ProductService {
    ProductDao productDao = new ProductDao();

    public void addProduct(Product product) {
        productDao.addProduct(product);
    }
}
