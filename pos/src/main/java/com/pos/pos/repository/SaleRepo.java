package com.pos.pos.repository;

import com.pos.pos.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepo  extends JpaRepository<SaleEntity,Integer> {

}
