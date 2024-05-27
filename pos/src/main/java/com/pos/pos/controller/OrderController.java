package com.pos.pos.controller;

import com.pos.pos.dao.OrderDao;
import com.pos.pos.dao.SaleDao;
import com.pos.pos.dto.OrderDto;
import com.pos.pos.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/orders")
@RestController
public class OrderController {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private SaleDao saleDao;

    @PostMapping("/saveOrder")
    public OrderEntity saveOrder(@RequestBody List<OrderDto> orderDto ){
        return this.saleDao.saveSale(orderDto);}


    //get all orders
    @GetMapping("/getAllOrders")
    public List<OrderEntity> getAllOrders(){
        return this.orderDao.getAllOrders();
    }
}
