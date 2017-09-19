package com.example.demo.controller;

import com.example.demo.entity.Dish;
import com.example.demo.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Alex on 19.09.2017.
 */

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class DishController {
    @Autowired
    private DishService dishService;

    public DishController(DishService dishService){
        this.dishService=dishService;
    }


    @GetMapping(value = "/dishes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Dish>> getDishes() {
        List<Dish> dishes=dishService.getAll();
        return ResponseEntity.ok().body(dishes);
    }

    @GetMapping(value = "/dishes/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dish> getDish(@PathVariable long id) {
        Dish dish=dishService.get(id);
        return ResponseEntity.ok().body(dish);
    }
    @PostMapping(value = "/dishes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dish> createDish(@RequestBody Dish dish) {

        return ResponseEntity.ok().body(dishService.save(dish));
    }

    @DeleteMapping(value = "/dishes/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dish> deleteDish(@PathVariable long id) {
        Dish dish=dishService.get(id);
        dishService.delete(id);
        return ResponseEntity.ok().body(dish);
    }

    @PutMapping(value = "/dishes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dish> updateDish(@RequestBody Dish dish) {

        return ResponseEntity.ok().body(dishService.save(dish));
    }








}


