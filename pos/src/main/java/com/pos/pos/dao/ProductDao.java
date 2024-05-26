package com.pos.pos.dao;

import com.pos.pos.entity.ProductEntity;
import com.pos.pos.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDao {

    @Autowired
    private ProductRepo productRepo;


    public ProductEntity addNewProduct(ProductEntity product){
        return  this.productRepo.save(product);

    }

    public ProductEntity updateProduct(ProductEntity product){
        return  this.productRepo.save(product);

    }


    public void deleteProduct (Integer id)
    {
         this.productRepo.deleteById(id);
    }
}
