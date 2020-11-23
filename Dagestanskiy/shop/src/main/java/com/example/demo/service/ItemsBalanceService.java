package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.entity.ItemsBalance;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ItemsBalanceRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
@Component
@Transactional
public class ItemsBalanceService {
    final ItemsBalanceRepository repository;

    @PostConstruct
    public void init(){
        repository.save(new ItemsBalance(null,42.00));
        repository.save(new ItemsBalance(null,43.00));
    }

    public ItemsBalanceService(ItemsBalanceRepository repository) {
        this.repository = repository;
    }
    public ItemsBalance saveItemsBalance(ItemsBalance toSave){
        return repository.save(toSave);
    }

}
