package com.example.simple_dictionary.Controller.Service.Impl;

import com.example.simple_dictionary.Controller.Repository.IDictionaryRepository;
import com.example.simple_dictionary.Controller.Service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {

    @Autowired
    private  IDictionaryRepository dictionaryRepository;
    @Override
    public String translate(String englishWord) {
        return dictionaryRepository.translate(englishWord);
    }
}
