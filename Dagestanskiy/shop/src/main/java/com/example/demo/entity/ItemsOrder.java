package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ItemsOrder extends EntityBase{
    @Column
    private String name;
    @Column
    private Double quantity;
    @ManyToOne
    private User userId;

//    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, mappedBy = "itemsOrderId",
//            orphanRemoval = true)

    @OneToMany
    private List<Item> items2 = new ArrayList<>();

}
