package com.example.template2.service.Impl;

import com.example.template2.model.Product;
import com.example.template2.repository.IProductRepository;
import com.example.template2.repository.Impl.ProductRepositoryImpl;
import com.example.template2.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    private final IProductRepository productRepository = new ProductRepositoryImpl();
    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void save(Product product) {
    productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id,product);

    }

    @Override
    public void remove(int id) {
      productRepository.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productRepository.searchByName(name);
    }
}
