package com.example.blog_service.service;

import com.example.blog_service.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category>findAll();
    Category findById(int id);
    void editCategory(Category category);
    void deleteCateGory(int id);
    void save(Category category);
}
