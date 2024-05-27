package com.pos.pos.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
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


    @JsonManagedReference
    @OneToOne
    @JoinColumn(name = "product_id",insertable = false,updatable = false)
    private ProductEntity product;



    @JsonManagedReference
    @OneToOne
    @JoinColumn(name = "order_id",insertable = false,updatable = false)
    private OrderEntity order;

}
