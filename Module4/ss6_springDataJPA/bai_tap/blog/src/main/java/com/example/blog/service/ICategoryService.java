package com.example.blog.service;

import com.example.blog.modal.Blog;
import com.example.blog.modal.Category;

import java.util.List;

public interface ICategoryService {
    public void save(Category category);
    public List<Category> findAll();
    public void remove(int id);
    public Category findById(int id);
}
