package com.example.demo.service;



import com.example.demo.repository.ProductsForDishRepository;

import java.util.List;

/**
 * Created by Alex on 17.09.2017.
 */
public interface ProdictsForDishRepository {

    ProductsForDishRepository save(ProductsForDishRepository productsForDish);
    List<ProductsForDishRepository> getAll();
    ProductsForDishRepository get(long id);
    void delete(ProductsForDishRepository productsForDish);
    void delete(long id);
}
