package com.example.demo.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User extends EntityBase {

    @Column
    private  String name;


    @OneToMany//(cascade = {CascadeType.MERGE,CascadeType.PERSIST},mappedBy = "userId",
//            orphanRemoval = true)
    private List<ItemsOrder> itemsOrders = new ArrayList<>();
}
