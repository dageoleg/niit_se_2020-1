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
public class ItemsBalance extends EntityBase {

    @OneToOne
//    @JoinColumn(name="item_id_id")
    private Item itemId;

    @Column
    private Double quantity;
}
