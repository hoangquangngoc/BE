package com.example.qli_spham.service;

import com.example.qli_spham.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> finAll();
    void save(Product product);
    void delete(Long id);
    Product findById(Long id);
}
