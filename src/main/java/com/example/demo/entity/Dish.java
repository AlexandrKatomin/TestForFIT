package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Alex on 17.09.2017.
 */
@Entity
@Setter
@Getter
@Table(name = "dish")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "name")
    String name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "dish", fetch = FetchType.LAZY)
    List<ProductsForDish> productsForDishList;

    public Dish(String name) {
        this.name = name;
    }
    public Dish() {

    }
}
