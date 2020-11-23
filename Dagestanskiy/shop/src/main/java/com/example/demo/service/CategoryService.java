package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.entity.Item;
import com.example.demo.repository.CategoryRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;

@Component
@Transactional
public class CategoryService {
    final CategoryRepository repository;

    @PostConstruct
    public void init(){
        repository.save(new Category("Бакалея",null));
//                new ArrayList<Item>(Arrays.<Item>asList())));
        repository.save(new Category("Химия",null));
    }
    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }
    public Category saveCategory(Category toSave){
        return repository.save(toSave);
    }
}
