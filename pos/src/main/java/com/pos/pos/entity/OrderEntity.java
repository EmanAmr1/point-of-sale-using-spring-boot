package com.pos.pos.entity;


import jakarta.persistence.*;
import lombok.Data;

@Table(name = "orders")
@Data
@Entity
public class OrderEntity {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(name = "total")
    private Double total;


}
