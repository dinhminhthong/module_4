package com.example.blog_service.service;

import com.example.blog_service.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService{
    @Autowired
    private IBlogService blogService;

    @Override
    public Blog findById(int id) {
        return blogService.findById(id);
    }

    @Override
    public List<Blog> findAll() {
        return blogService.findAll();
    }

    @Override
    public Page<Blog> findByNameContaining(String name, Pageable pageable) {
        return  blogService.findByNameContaining(name,pageable);
    }

    @Override
    public void editBlog(Blog blog) {
        blogService.editBlog(blog);
    }

    @Override
    public void save(Blog blog) {
        blogService.save(blog);
    }

    @Override
    public void deleteBlog(int id) {
        blogService.deleteBlog(id);
    }
}
