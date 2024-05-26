package com.pos.pos.dao;

import com.pos.pos.entity.ProductEntity;
import com.pos.pos.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

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



    public ProductEntity getProductByBarcode( String barcode)
    {
        Optional<ProductEntity> O=Optional.ofNullable(this.productRepo.findByBarcode(barcode));
          return O.isPresent() ?O.get() :null;
    }

    public ProductEntity getProductById(Integer id)
    {
        Optional<ProductEntity> O=this.productRepo.findById(id);
        return O.isPresent() ?O.get() :null;
    }

}
