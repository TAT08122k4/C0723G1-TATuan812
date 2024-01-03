package com.example.product.service;

import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);
    void saveProduct(Product product);
    void deleteProduct(Long id);
    Product findById(long id);
Page<Product> findAll(Pageable pageable,String name,Integer categoryId);

}
