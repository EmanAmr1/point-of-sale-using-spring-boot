package com.pos.pos.dao;


import com.pos.pos.dto.OrderDto;
import com.pos.pos.entity.OrderEntity;
import com.pos.pos.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDao {

    @Autowired
    private OrderRepo orderRepo;


    public OrderEntity saveOrder(List<OrderDto> orderDto){
        Double total=0.00 ;

        for(OrderDto o:orderDto){
            total += o.getProductPrice();
        }

     OrderEntity orderEntity =new OrderEntity(); //take obj from order entity
        orderEntity.setTotal(total);             //set total of order
        return this.orderRepo.save(orderEntity); //save total price of order

    }

    //get all orders

    public List<OrderEntity> getAllOrders(){
        return this.orderRepo.findAll();
    }



}
