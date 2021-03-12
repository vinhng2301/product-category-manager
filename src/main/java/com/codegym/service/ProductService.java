package com.codegym.service;

import com.codegym.model.Category;
import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Product findById(Long id);

    void save(Product product);

    void remove(Long id);

    Iterable<Product> findAllByCategory (Category category);

    Page<Product> findAllByNameContaining(String firstname, Pageable pageable);
}
