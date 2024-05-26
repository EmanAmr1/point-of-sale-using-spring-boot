package com.pos.pos.controller;


import com.pos.pos.dao.ProductDao;
import com.pos.pos.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;


    @PostMapping("/addProduct")
    public ProductEntity addNewProduct(@RequestBody ProductEntity product){
        return  this.productDao.addNewProduct(product);

    }


    @PutMapping("/updateProduct")
    public ProductEntity updateProduct(@RequestBody ProductEntity product){
        return  this.productDao.updateProduct(product);

    }


    @GetMapping("/deleteProduct")
    public String deleteProduct(@RequestParam int id){
        this.productDao.deleteProduct(id);
        return "successfully deleted";
    }


    @GetMapping("/getProductByBarcode")
    public ProductEntity getProductByBarcode(@RequestParam String barcode)
    {
           return  this.productDao.getProductByBarcode(barcode);
    }

    @GetMapping("/getProductById")
    public ProductEntity getProductBId(@RequestParam int id)
    {
        return  this.productDao.getProductById(id);
    }

    @GetMapping("/getAllProducts")
    public List<ProductEntity> getAllProducts(){
        return this.productDao.getAllProducts();
    }

}
