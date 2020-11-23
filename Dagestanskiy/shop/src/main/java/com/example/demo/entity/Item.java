package com.example.demo.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Item extends EntityBase {

    @Column
    private String itemName;

    @ManyToOne
    private Category categoryId;

    @OneToOne(fetch = FetchType.LAZY)
    private ItemsBalance itemsBalanceId;

    @ManyToOne
    private ItemsOrder itemsOrderID;






}
