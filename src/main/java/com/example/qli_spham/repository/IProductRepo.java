package com.example.qli_spham.repository;

import com.example.qli_spham.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product , Long> {
}
