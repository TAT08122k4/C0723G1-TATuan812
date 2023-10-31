package com.example.ung_dung_quan_ly_san_pham.repository;

import com.example.ung_dung_quan_ly_san_pham.model.Products;

import java.util.List;

public interface IProductsRepository {
    public List<Products> getAll();
    public void saveProducts(Products products);
    void edit(int id,Products products);
    void remove (int id);
    Products getDetail(int id);
    List<Products> findByName(String name);
}
