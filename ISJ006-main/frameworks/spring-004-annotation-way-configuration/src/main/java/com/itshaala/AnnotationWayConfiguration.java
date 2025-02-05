package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class AnnotationWayConfiguration {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
        Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product);
    }
}
