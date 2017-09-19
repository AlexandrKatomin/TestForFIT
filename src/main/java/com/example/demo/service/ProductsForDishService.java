package com.example.demo.service;

import com.example.demo.entity.ProductsForDish;
import com.example.demo.repository.ProductsForDishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by Alex on 17.09.2017.
 */
@Service("ProductsForDishService")
public class ProductsForDishService {
    @Autowired
    ProductsForDishRepository productsForDishRepository;

    public ProductsForDish save(ProductsForDish productsForDish) {
        return productsForDishRepository.saveAndFlush(productsForDish);
    }

    public ProductsForDish get(long id) {

        return productsForDishRepository.findOne(id);
    }

    public List<ProductsForDish> getAll() {
        return productsForDishRepository.findAll();
    }

    public void delete(ProductsForDish productsForDish) {
        productsForDishRepository.delete(productsForDish);
    }

    public void delete(long id) {
        productsForDishRepository.delete(id);
    }
}
