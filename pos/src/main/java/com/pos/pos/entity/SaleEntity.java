package com.pos.pos.entity;


import jakarta.persistence.*;
import lombok.Data;

@Table(name = "sales")
@Data
@Entity
public class SaleEntity {

    @Id
    @Column(name = "sale_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int saleId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "barcode")
    private String barcode;

}
