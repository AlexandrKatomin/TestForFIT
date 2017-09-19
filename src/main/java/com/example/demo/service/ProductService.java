package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alex on 17.09.2017.
 */
@Service("ProductService")
public class ProductService implements IProductService {
    @Autowired
    ProductRepository productRepository;

    public Product save(Product contract) {
        return productRepository.saveAndFlush(contract);
    }

    public Product get(long id) {

        return productRepository.findOne(id);
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public void delete(Product contract) {
        productRepository.delete(contract);
    }

    public void delete(long id) {
        productRepository.delete(id);
    }
}
