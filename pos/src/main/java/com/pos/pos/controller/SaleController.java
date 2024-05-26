package com.pos.pos.controller;


import com.pos.pos.dao.SaleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Sales")
@RestController
public class SaleController {

    @Autowired
    private SaleDao saleDao;
 }
