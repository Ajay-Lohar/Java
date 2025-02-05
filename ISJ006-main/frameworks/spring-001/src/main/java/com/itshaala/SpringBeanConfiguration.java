package com.itshaala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringBeanConfiguration {

   /* @Bean
    public Student student() {
        return new Student(103, "Akshay", "Delhi");
    }*/
}
