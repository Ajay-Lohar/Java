package com.ajay.onlinefoodordering.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User customer;

    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;

    private long totalAmount ;

    private String OrderStatus ;

    private Date createdAt;

    @ManyToOne
    private Address  deliveryAddress;

    @OneToMany
    private List<Orderitem> items ;

//    private Payment payment;

    private int totalItem ;

    private int totalPrice ;
}
