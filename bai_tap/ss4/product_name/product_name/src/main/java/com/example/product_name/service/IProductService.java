package com.example.product_name.service;

import com.example.product_name.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll(String name);
    public void create(Product product);

    void remove(int id);
    Product findById(int id);
    void edit(int id, Product product);
}
