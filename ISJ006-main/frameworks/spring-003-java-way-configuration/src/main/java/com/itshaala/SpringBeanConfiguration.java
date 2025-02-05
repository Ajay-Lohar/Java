package com.itshaala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringBeanConfiguration {


    @Bean(name = "product1")
    public Product getProduct(){
        return new Product(101,"Laptop",45000);
    }
}
