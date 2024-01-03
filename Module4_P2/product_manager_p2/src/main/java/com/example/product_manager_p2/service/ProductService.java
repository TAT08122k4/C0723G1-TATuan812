package com.example.product_manager_p2.service;

import com.example.product_manager_p2.model.Product;
import com.example.product_manager_p2.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    IProductRepository iProductRepository;
    @Override
    public List<Product> displayAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void saveProduct(Product product) {
      iProductRepository.save(product);
    }
    @Override
    public void deleteProduct(int id) {
        iProductRepository.deleteById(id);
    }

}
