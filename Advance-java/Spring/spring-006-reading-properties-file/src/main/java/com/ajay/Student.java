package com.ajay;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder

@Component
@PropertySource("classpath:application.properties")
public class Student {
    @Value("101")
    //@Value("${student.id}")--> Thise Are Useing Annotation WAy
    private  int id;

    @Value("Shraddha")
   // @Value("${student.name}")--> Thise Are Useing Annotation WAy
    private String name;

    @Value("23")
    //@Value("${student.age}")--> Thise Are Useing Annotation Way
    private int age;

    @Value("Kolhapur")
    //@Value("${student.address}")--> Thise Are Useing Annotation Way
    private String address;
}