package com.dan.data.springdataexample;

import com.dan.data.springdataexample.entities.componentmapping.Address;
import com.dan.data.springdataexample.entities.componentmapping.EmployeeComponent;
import com.dan.data.springdataexample.repository.componentmapping.ComponentEmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ComponentMappingTests {

    @Autowired
    ComponentEmployeeRepository repository;

    @Test
    void componentTest() {
        EmployeeComponent e = EmployeeComponent.builder()
                .id(10).name("Martinez")
                .address(Address.builder().city("Burnaby")
                        .state("British Columbia").zipcode("55430").country("Canada")
                        .streetaddress("yada yada yada").build())
                .build();


        repository.save(e);
    }
}
