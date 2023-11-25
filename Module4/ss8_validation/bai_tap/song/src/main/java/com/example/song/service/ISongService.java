package com.example.song.service;

import com.example.song.model.Song;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ISongService {
     void addNewSong(Song song);
     void editSong(Song song);
     List<Song> getAll();
}
