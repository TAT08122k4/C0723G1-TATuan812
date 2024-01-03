package com.example.product_manager_p2.service;

import com.example.product_manager_p2.model.Category;

import java.util.List;

public interface ICategoryService {
    void saveCategory(Category category);
    List<Category> displayAll();
    void deleteCategory(int id);
}
