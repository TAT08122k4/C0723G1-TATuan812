package com.example.tuan_be_sprint2.service;


import com.example.tuan_be_sprint2.model.Author;
import com.example.tuan_be_sprint2.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements IAuthorService {
    @Autowired
    AuthorRepository authorRepository;
    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author findAuthorById(int id) {
        return authorRepository.findById(id).get();
    }
}
