package com.example.product.service;

import com.example.product.model.Category;
import com.example.product.repository.ICategoryRepository;
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
    public void deleteById(int id) {
        iCategoryRepository.deleteById(id);

    }

    @Override
    public List<Category> displayAll() {
        return iCategoryRepository.findAll();
    }
}
