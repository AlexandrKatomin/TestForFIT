package com.example.demo.service;



import com.example.demo.entity.Dish;

import java.util.List;

/**
 * Created by Alex on 17.09.2017.
 */
public interface IDishService {

    Dish save(Dish dish);
    List<Dish> getAll();
    Dish get(long id);
    void delete(Dish dish);
    void delete(long id);
}
