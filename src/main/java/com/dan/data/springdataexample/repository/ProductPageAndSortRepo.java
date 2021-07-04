package com.dan.data.springdataexample.repository;

import com.dan.data.springdataexample.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductPageAndSortRepo extends PagingAndSortingRepository<Product, Integer> {
    List<Product> findByName(String name);

    List<Product> findByNameAndDesc(String name, String desc);

    List<Product> findByNameOrDesc(String name, String desc);

    List<Product> findByPriceGreaterThan(Double price);

    List<Product> findByDescStartingWith(String desc);

    List<Product> findByNameIsLike(String name);

    List<Product> findByDescIgnoreCaseContaining(String desc);

    List<Product> findByIdIn(List<Integer> ids, Pageable pageable);
}
