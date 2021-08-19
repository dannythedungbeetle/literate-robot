package com.dan.data.springdataexample;

import com.dan.data.springdataexample.entities.onetoone.License;
import com.dan.data.springdataexample.entities.onetoone.Person;
import com.dan.data.springdataexample.repository.relationships.onetoone.LicenceRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class OneToOneMappingTests {
    @Autowired
    LicenceRepo repository;

    @Test
    void contextLoads() {
    }

    @Test
    void testLicenseInsert() {

        Person p = new Person();
        p.setAge(27);
        p.setFirstName("Viktor");
        p.setLastName("Gunturu");


        License license = new License();
        license.setType("CAR");
        license.setValidFrom(new Date());
        license.setValidTo(new Date());
        license.setPerson(p);

        repository.save(license);
    }
}
