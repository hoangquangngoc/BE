package com.example.qli_spham.service.impl;

import com.example.qli_spham.model.Product;
import com.example.qli_spham.repository.IProductRepo;
import com.example.qli_spham.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepo iProductRepo;

    @Override
    public List<Product> finAll() {
        return (List<Product>) iProductRepo.findAll();
    }

    @Override
    public void save(Product product) {
        iProductRepo.save(product);

    }

    @Override
    public void delete(Long id) {
        iProductRepo.deleteById(id);

    }

    @Override
    public Product findById(Long id) {
        return iProductRepo.findById(id).get();
    }
}
