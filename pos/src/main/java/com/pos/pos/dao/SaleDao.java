package com.pos.pos.dao;

import com.pos.pos.repository.SaleRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleDao {

    @Autowired
    private SaleRepo saleRepo;
}
