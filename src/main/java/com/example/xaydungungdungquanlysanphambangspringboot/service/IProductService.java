package com.example.xaydungungdungquanlysanphambangspringboot.service;

import com.example.xaydungungdungquanlysanphambangspringboot.model.Product;


import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    void remove(Long id);
}
