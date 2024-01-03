package com.example.product_manager_p2.service;

import com.example.product_manager_p2.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> displayAll();
    void saveProduct(Product product);
    void deleteProduct(int id);

}
