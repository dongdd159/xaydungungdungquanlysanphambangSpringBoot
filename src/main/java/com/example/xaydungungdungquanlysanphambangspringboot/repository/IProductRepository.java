package com.example.xaydungungdungquanlysanphambangspringboot.repository;

import com.example.xaydungungdungquanlysanphambangspringboot.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends CrudRepository<Product, Long> {
}
