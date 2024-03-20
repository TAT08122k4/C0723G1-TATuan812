package com.example.tuan_be_sprint2.service;


import com.example.tuan_be_sprint2.model.Language;
import com.example.tuan_be_sprint2.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService implements ILanguageService {
    @Autowired
    LanguageRepository languageRepository;

    @Override
    public List<Language> getAll() {
        return languageRepository.findAll();
    }
}
