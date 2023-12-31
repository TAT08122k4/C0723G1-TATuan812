package com.example.template2.service;

import com.example.template2.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    void save(Product product);
    Product findById(int id);
    void update(int id,Product product);
    void remove(int id);
    List<Product> searchByName(String name);

}
