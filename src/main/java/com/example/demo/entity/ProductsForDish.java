package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Alex on 17.09.2017.
 */
@Entity
@Getter
@Setter
@Table(name = "productsForDish")
public class ProductsForDish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    @JoinColumn(name = "id_product")
    Product product;

    @ManyToOne
    @JoinColumn(name = "id_dish")
    Dish dish;

    @Column(name = "count")
    Double count;






}
