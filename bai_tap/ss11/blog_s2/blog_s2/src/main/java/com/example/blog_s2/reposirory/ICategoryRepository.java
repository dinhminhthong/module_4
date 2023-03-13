package com.example.blog_s2.reposirory;

import com.example.blog_s2.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {

}
