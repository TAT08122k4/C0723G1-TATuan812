package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IBlogService {
    public void addNewBlog(Blog blog);
    public List<Blog> displayAllBlog();
    public Blog showDetail(int id);
//    public void updateBlog(Blog blog);
    public void remove(int id);
    public List<Blog> findCategoriesById(int id);
    Page<Blog> displayAllBlog(String name, Pageable pageable);

}
