package com.pos.pos.controller;


import com.pos.pos.dao.ProductDao;
import com.pos.pos.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;


    @GetMapping("/addProduct")
    public ProductEntity addNewProduct(@RequestBody ProductEntity product){
        return  this.productDao.addNewProduct(product);

    }

}
