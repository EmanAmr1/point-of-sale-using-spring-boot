package com.pos.pos.dao;

import com.pos.pos.dto.OrderDto;
import com.pos.pos.entity.OrderEntity;
import com.pos.pos.entity.SaleEntity;
import com.pos.pos.repository.SaleRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleDao {

    @Autowired
    private SaleRepo saleRepo;

    private OrderDao orderDao;

    public SaleDao(OrderDao orderDao){  //initialization

        this.orderDao=orderDao;
    }



public OrderEntity saveSale(List<OrderDto> orderDto){

        if(orderDto.size()==0)  //no order
            return null;

    OrderEntity order =this.orderDao.saveOrder(orderDto); //save order

    orderDto.forEach(o->{
        SaleEntity saleEntity = new SaleEntity(); //every time make obj from sale entity
        saleEntity.setOrderId(order.getOrderId()); //order is fixed so we call it with obj
        saleEntity.setProductId(o.getProductId()); //get every product id
        this.saleRepo.save(saleEntity); //save sale
    });
    return order;
}


}
