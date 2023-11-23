package com.example.blog.service;

import com.example.blog.modal.Blog;
import com.example.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public void addNewBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public List<Blog> displayAllBlog() {
        return blogRepository.findAll();
    }

    @Override
    public Blog showDetail(int id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public void remove(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public List<Blog> findCategoriesById(int id) {
        return blogRepository.findCategoriesById(id);
    }
    @Override
    public Page<Blog> displayAllBlog(String name, Pageable pageable) {
        return blogRepository.search("%" + name + "%", pageable);
    }
}
