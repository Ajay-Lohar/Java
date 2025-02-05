package classComponents.methods.productMgmt.service;

import classComponents.methods.productMgmt.dao.ProductDao;
import classComponents.methods.productMgmt.model.Product;

public class ProductService {
    ProductDao productDao = new ProductDao();

    public void addProduct(Product product) {
        productDao.addProduct(product);
    }


}