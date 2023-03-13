package com.example.blog_s2.reposirory;

import com.example.blog_s2.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    Blog findById(int id);
    Page<Blog>findByCategory(@Param("id") int id, Pageable pageable);
    Page<Blog>findByNameContaining(String name,Pageable pageable);
}
