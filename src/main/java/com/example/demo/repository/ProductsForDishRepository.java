package com.example.demo.repository;

import com.example.demo.entity.ProductsForDish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by Alex on 17.09.2017.
 */
@Repository
public interface ProductsForDishRepository extends JpaRepository<ProductsForDish,Long> {
}
