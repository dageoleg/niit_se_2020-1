package com.example.demo.repository;

import com.example.demo.entity.ItemsBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ItemsBalanceRepository extends JpaRepository<ItemsBalance,Long> {
}
