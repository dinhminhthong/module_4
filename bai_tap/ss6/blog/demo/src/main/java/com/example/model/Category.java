package com.example.exercise_optional.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)

    Set<com.example.exercise_optional.model.Blog> blogSet;

    public Category(int id, String category, Set<com.example.exercise_optional.model.Blog> blogSet) {
        this.id = id;
        this.name = category;
        this.blogSet = blogSet;
    }

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String category) {
        this.name = category;
    }

    public Set<com.example.exercise_optional.model.Blog> getBlogSet() {
        return blogSet;
    }

    public void setBlogSet(Set<com.example.exercise_optional.model.Blog> blogSet) {
        this.blogSet = blogSet;
    }
}