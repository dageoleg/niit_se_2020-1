package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.entity.Item;
import com.example.demo.entity.ItemsOrder;
import com.example.demo.repository.ItemRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Component
@Transactional
public class ItemServiсe {
    final ItemRepository repository;

    @PostConstruct
    public void init(){
        repository.save(new Item("Крупа",null,null,
                null));
        repository.save(new Item("Макароны",null,null,
                null));

    }

    public ItemServiсe(ItemRepository repository) {
        this.repository = repository;
    }
    public Item saveItem(Item toSave){
        return repository.save(toSave);
    }
}

