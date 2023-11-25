package com.example.song.service;

import com.example.song.model.Song;
import com.example.song.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements ISongService{


    @Autowired
    ISongRepository iSongRepository;
    @Override
    public void addNewSong(Song song) {
    iSongRepository.save(song);
    }

    @Override
    public void editSong(Song song) {
    iSongRepository.save(song);
    }

    @Override
    public List<Song> getAll() {
        return iSongRepository.findAll();
    }
}
