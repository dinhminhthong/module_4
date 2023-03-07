package com.example.service;

import com.example.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    void save(Song song);
    Song findById(int id);
    Page<Song> findByName(String name, Pageable pageable);
    Page<Song>findByNameAndSingerAndCategory(String nameSearch,String singerSearch,String category,Pageable pageable);
}
