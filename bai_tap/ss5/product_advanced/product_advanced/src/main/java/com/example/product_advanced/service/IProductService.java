package com.example.product_advanced.service;

import com.example.product_advanced.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void create(Product product);
    void remove(int id);
    void update(Product product);
    Product findById(int id);
    List<Product> findByNam(String name);
}
