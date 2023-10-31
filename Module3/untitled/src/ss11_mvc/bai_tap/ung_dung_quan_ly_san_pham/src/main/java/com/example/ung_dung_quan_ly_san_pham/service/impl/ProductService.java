package com.example.ung_dung_quan_ly_san_pham.service.impl;

import com.example.ung_dung_quan_ly_san_pham.model.Products;
import com.example.ung_dung_quan_ly_san_pham.repository.IProductsRepository;
import com.example.ung_dung_quan_ly_san_pham.repository.impl.ProductsRepository;
import com.example.ung_dung_quan_ly_san_pham.service.IProductsService;

import java.util.List;

public class ProductService implements IProductsService {
    private final IProductsRepository productsRepository = new ProductsRepository();
    @Override
    public List<Products> getAll() {
        return productsRepository.getAll();
    }

    @Override
    public void saveProducts(Products products) {
          productsRepository.saveProducts(products);
    }

    @Override
    public void edit(int id, Products products) {
    productsRepository.edit(id,products);
    }

    @Override
    public void remove(int id) {
        productsRepository.remove(id);

    }

    @Override
    public Products getDetail(int id) {
        return productsRepository.getDetail(id);
    }

    @Override
    public List<Products> findByName(String name) {
        return productsRepository.findByName(name);
    }
}
