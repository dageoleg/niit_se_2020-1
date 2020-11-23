package com.example.demo.service;

import com.example.demo.entity.ItemsOrder;
import com.example.demo.entity.User;
import com.example.demo.repository.ItemsOrderRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Component
@Transactional
public class UserService {
    final UserRepository repository;

    @PostConstruct
    public void init(){
        repository.save(new User("Иван",null));
        repository.save(new User("Петр",null));
    }

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User toSave){
        return repository.save(toSave);
    }

}
