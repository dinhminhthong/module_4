package com.example.service;

import com.example.model.Song;
import com.example.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository songRepository;

    @Override
    public List<Song> findAll() {
        return  this.songRepository.findAll();
    }

    @Override
    public void save(Song song) {
        songRepository.save(song);
    }

    @Override
    public Song findById(int id) {
        return songRepository.findById(id).get();
    }

    @Override
    public Page<Song> findByName(String name, Pageable pageable) {
        return songRepository.findByNameSongContaining(name,pageable);
    }

    @Override
    public Page<Song> findByNameAndSingerAndCategory(String nameSearch, String singerSearch, String category, Pageable pageable) {
        return songRepository.findByNameSongContainingAndSingerContainingAndCategoryContaining(nameSearch,singerSearch,category,pageable);
    }


}
