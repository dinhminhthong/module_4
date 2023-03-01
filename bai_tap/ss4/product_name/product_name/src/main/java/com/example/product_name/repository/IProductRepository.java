package com.example.product_name.repository;

import com.example.product_name.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll(String name);
    void create(Product product);
    void remove(int id);
    Product findById(int id);
    void edit(int id, Product product);
}
