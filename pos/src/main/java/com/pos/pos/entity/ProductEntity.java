package com.pos.pos.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "products")
@Data
@Entity
public class ProductEntity {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name = "barcode")
    private String barcode;







}
