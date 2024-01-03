package com.example.product_manager_p2.service;

import com.example.product_manager_p2.model.Category;
import com.example.product_manager_p2.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    ICategoryRepository iCategoryRepository;
    @Override
    public void saveCategory(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public List<Category> displayAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public void deleteCategory(int id) {
        iCategoryRepository.deleteById(id);
    }
}
