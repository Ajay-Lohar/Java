package com.itshaala;

import com.itshaala.controller.ProductController;
import com.itshaala.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class AnnotationWayConfiguration {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
        Product product = new Product();
        ProductController productController = applicationContext.getBean(ProductController.class);
        productController.addProduct(product);
    }
}
