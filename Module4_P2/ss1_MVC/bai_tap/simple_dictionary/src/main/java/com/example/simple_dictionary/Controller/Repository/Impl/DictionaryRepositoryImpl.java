package com.example.simple_dictionary.Controller.Repository.Impl;

import com.example.simple_dictionary.Controller.Repository.IDictionaryRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DictionaryRepositoryImpl implements IDictionaryRepository {
    @Override
    public String translate(String englishWord) {
        englishWord = englishWord.toLowerCase().trim();
        if(englishWord == null){
            englishWord = "";
        }
        String wordTranslate = "";
        switch (englishWord){
            case "dog":
                wordTranslate = "chó";
                break;
            case "cat":
                wordTranslate = "mèo";
                break;
            case "pig":
                wordTranslate = "lợn";
                break;
            case "snake":
                wordTranslate = "rắn";
                break;
            case "":
                wordTranslate = "Plz dont be empty";
                break;
            default:
                wordTranslate = "sorry , we could not find this word";
        }
        return wordTranslate;
    }
}
