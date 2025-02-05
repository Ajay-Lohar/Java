package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class XmlWayConfiguration {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring.bean.config.xml");
        Product product1 = applicationContext.getBean("product1", Product.class);
        Product product2 = applicationContext.getBean("product1", Product.class);
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
    }
}
