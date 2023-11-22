package com.example.blog.service;

import com.example.blog.modal.Blog;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IBlogService {
    public void addNewBlog(Blog blog);
    public List<Blog> displayAllBlog();
    public Blog showDetail(int id);
//    public void updateBlog(Blog blog);
    public void remove(int id);
}
