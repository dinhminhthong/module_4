package com.example.blog_service.service;

import com.example.blog_service.model.Blog;
import com.example.blog_service.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private ICategoryService categoryService;

    @Override
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @Override
    public Category findById(int id) {
        return  categoryService.findById(id);
    }

    @Override
    public void editCategory(Category category) {
        categoryService.editCategory(category);
    }

    @Override
    public void deleteCateGory(int id) {
        categoryService.deleteCateGory(id);
    }

    @Override
    public void save(Category category) {
        categoryService.save(category);
    }
}
