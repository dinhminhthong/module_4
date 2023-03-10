package com.example.repository;

import com.example.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Blob;

public interface IBlogRepository extends JpaRepository<Blob, Integer> {
    Blog findById(int id);

    Page<Blog> findByNameContaining(String name, Pageable pageable);
}
