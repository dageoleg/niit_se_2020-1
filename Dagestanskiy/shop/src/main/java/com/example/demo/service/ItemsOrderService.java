package com.example.demo.service;

import com.example.demo.entity.ItemsBalance;
import com.example.demo.entity.ItemsOrder;
import com.example.demo.repository.ItemsBalanceRepository;
import com.example.demo.repository.ItemsOrderRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Component
@Transactional
public class ItemsOrderService {


    final ItemsOrderRepository repository;

    @PostConstruct
    public void init(){
        repository.save(new ItemsOrder("счёт 42",22.00,null,null));
        repository.save(new ItemsOrder("счёт 43",23.00,null,null));
    }

    public ItemsOrderService(ItemsOrderRepository repository) {
        this.repository = repository;
    }

    public ItemsOrder saveItemsOrder(ItemsOrder toSave){
        return repository.save(toSave);
    }

}
