package com.example.tuan_be_sprint2.service;

import com.example.tuan_be_sprint2.model.Genre;

import java.util.List;

public interface IGenreService {
    List<Genre> getAll();
    Genre findGenreById(int id);
}
