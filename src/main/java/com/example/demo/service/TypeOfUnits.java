package com.example.demo.service;

import java.util.List;

/**
 * Created by Alex on 17.09.2017.
 */
public interface TypeOfUnits {

    TypeOfUnits save(TypeOfUnits typeOfUnits);
    List<TypeOfUnits> getAll();
    TypeOfUnits get(long id);
    void delete(TypeOfUnits typeOfUnits);
    void delete(long id);
}
