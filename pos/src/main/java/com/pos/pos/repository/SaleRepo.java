package com.pos.pos.repository;

import com.pos.pos.entity.SaleEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepo  extends JpaRepository<SaleEntity,Integer> {

List<SaleEntity> findAllByOrderId(Integer orderId);
}
