package com.dan.data.springdataexample;

import com.dan.data.springdataexample.entities.Employee;
import com.dan.data.springdataexample.repository.EmpRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmpTests {
    @Autowired
    EmpRepo repo;

    @Test
    void contextLoads() {
    }

    @Test
    void one() {
        for (int a = 0; a < 100; a++) {
            Employee emp = new Employee();
            emp.setName("Tony Montana");

            repo.save(emp);
        }
    }
}
