package com.example.demo.service;


import com.example.demo.entity.Product;

import java.util.List;

/**
 * Created by Alex on 17.09.2017.
 */
public interface IProductService   {

    Product save(Product product);
    List<Product> getAll();
    Product get(long id);
    void delete(Product product);
    void delete(long id);
}
