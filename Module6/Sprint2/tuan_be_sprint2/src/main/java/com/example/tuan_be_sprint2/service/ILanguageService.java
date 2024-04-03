package com.example.tuan_be_sprint2.service;

import com.example.tuan_be_sprint2.model.LanguageBook;

import java.util.List;

public interface ILanguageService {
    List<LanguageBook> getAll();
    LanguageBook findLanguageById(int id);
}
