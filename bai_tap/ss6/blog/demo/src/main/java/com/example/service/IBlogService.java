package com.example.service;

import com.example.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog>findAll();
    void save(Blog blog);
    void  delete(int id);
    Optional findById(int id);
}