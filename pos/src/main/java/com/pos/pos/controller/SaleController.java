package com.pos.pos.controller;


import com.pos.pos.dao.SaleDao;
import com.pos.pos.entity.SaleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/Sales")
@RestController
public class SaleController {

    @Autowired
    private SaleDao saleDao;


    @GetMapping("/getSales")
    public List<SaleEntity> getSales(){
        return  this.saleDao.getSales();
    }

 }
