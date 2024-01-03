package com.example.product.service;

import com.example.product.model.Category;

import java.util.List;

public interface ICategoryService {
    void saveCategory(Category category);
    void deleteById(int id);
    List<Category> displayAll();
}
