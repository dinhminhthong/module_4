package com.example.product_name.service;

import com.example.product_name.model.Product;
import com.example.product_name.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService  implements IProductService{
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll(String name) {
        return productRepository.findAll(name);
    }

    @Override
    public void create(Product product) {
        productRepository.create(product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void edit(int id, Product product) {
        productRepository.edit(id,product);
    }


}
