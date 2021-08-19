package com.dan.data.springdataexample;

import com.dan.data.springdataexample.entities.Product;
import com.dan.data.springdataexample.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Optional;

@SpringBootTest
class SpringDataExampleApplicationTests {

    @Autowired
    ProductRepository productRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreate() {
        Product product = new Product();
        product.setId(1);
        product.setName("iphone x");
        product.setDesc("mobile phone 6");
        product.setPrice(1000d);

        productRepository.save(product);
    }

    @Test
    public void testRead() {
        Optional<Product> productOptional = productRepository.findById(1);
        productOptional.ifPresent(System.out::println);
    }

    @Test
    public void testUpdate() {
        Optional<Product> productOptional = productRepository.findById(1);
        productOptional.ifPresent(product -> {
            product.setPrice(1250d);
            productRepository.save(product);
        });
    }

    @Test
    public void deleteStuff() {
        if (productRepository.existsById(1)) {
            productRepository.deleteById(1);
        }
    }

    @Test
    public void countStuff() {
        testCreate();
        System.out.println(productRepository.count());
    }

    @Test
    public void findByNameExample() {
        productRepository.findByName("dryer").forEach(System.out::println);
    }

    @Test
    public void findByDescAndName() {
        productRepository.findByNameAndDesc("i watch", "Apple - iWatch").forEach(System.out::println);
    }

    @Test
    public void findByNameOrDesc() {
        productRepository.findByNameOrDesc("meh", "dryer by LG").forEach(System.out::println);
    }

    @Test
    public void greaterThanExample() {
        productRepository.findByPriceGreaterThan(1200d).forEach(System.out::println);
    }

    @Test
    public void startingWithExample() {
        productRepository.findByDescStartingWith("Apple").forEach(System.out::println);
    }

    @Test
    public void findByNameLikeExample() {
        productRepository.findByNameIsLike("%r%").forEach(System.out::println);
    }

    @Test
    public void findByNameContains() {
        productRepository.findByDescIgnoreCaseContaining("aPplE").forEach(System.out::println);
    }

    @Test
    public void findByIdInExample() {
        productRepository.findByIdIn(Arrays.asList(1, 2, 3)).forEach(System.out::println);
    }

    @Test
    @Transactional
    public void testCaching() {
        Optional<Product> byId = productRepository.findById(1);
        if (byId.isPresent()) {
            System.out.println(byId);
        }
        productRepository.findById(1);
        productRepository.findById(1);
    }
}
