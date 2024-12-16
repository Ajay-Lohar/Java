package com.ajay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ajay"})
public class SpringConfiguration {

     @Bean
    public Student student() {
        //return new Student();
        return Student.builder()
                .id(1)
                .name("Pratiksha")
                .age(22)
                .address("Karad")
                .build();
    }

}
