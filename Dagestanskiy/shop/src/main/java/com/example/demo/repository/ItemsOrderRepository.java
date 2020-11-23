package com.example.demo.repository;

import com.example.demo.entity.ItemsOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ItemsOrderRepository extends JpaRepository<ItemsOrder,Long> {
}
