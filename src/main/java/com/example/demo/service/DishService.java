package com.example.demo.service;

import com.example.demo.entity.Dish;
import com.example.demo.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by Alex on 17.09.2017.
 */
@Service("DishService")
public class DishService implements IDishService {
    @Autowired
    DishRepository dishRepository;

    public Dish save(Dish contract) {
        return dishRepository.saveAndFlush(contract);
    }

    public Dish get(long id) {

        return dishRepository.findOne(id);
    }

    public List<Dish> getAll() {
        return dishRepository.findAll();
    }

    public void delete(Dish contract) {
        dishRepository.delete(contract);
    }

    public void delete(long id) {
        dishRepository.delete(id);
    }

}
