package com.dan.data.springdataexample;

import com.dan.data.springdataexample.entities.Product;
import com.dan.data.springdataexample.repository.ProductPageAndSortRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Arrays;

@SpringBootTest
public class ProductPageNSortTests {
    @Autowired
    ProductPageAndSortRepo repo;

    @Test
    void contextLoads() {
    }

    @Test
    public void testFindAll() {
        Pageable pageable = PageRequest.of(1, 2);
        Page<Product> all = repo.findAll(pageable);
        all.forEach(System.out::println);
    }

    @Test
    public void findAllSortByName() {
        repo.findAll(Sort.by(new Sort.Order(Sort.Direction.ASC, "price"))).forEach(System.out::println);
    }

    @Test
    public void findAllSortByDesc() {
        repo.findAll(Sort.by(new Sort.Order(Sort.Direction.DESC, "desc"))).forEach(System.out::println);
    }

    @Test
    void findAllSortMultipleFields() {
        repo.findAll(Sort.by(Sort.Direction.DESC, "price", "desc")).forEach(System.out::println);
    }

    @Test
    void testFindAllAndSort() {
        Page<Product> all = repo.findAll(PageRequest.of(0, 2, Sort.Direction.DESC, "desc"));
        all.forEach(System.out::println);
    }

    @Test
    void testFindByCustomPageable() {
        repo.findByIdIn(Arrays.asList(1, 2, 3), PageRequest.of(0, 2)).forEach(System.out::println);
    }
}
