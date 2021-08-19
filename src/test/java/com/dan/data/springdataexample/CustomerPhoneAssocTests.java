package com.dan.data.springdataexample;


import com.dan.data.springdataexample.entities.relationships.onetomany.Customer;
import com.dan.data.springdataexample.entities.relationships.onetomany.PhoneNumber;
import com.dan.data.springdataexample.repository.relationships.onetomany.CustomerPhoneRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerPhoneAssocTests {

    @Autowired
    CustomerPhoneRepo repo;

    @Test
    void testCreateCustomer() {
        Customer customer = new Customer();
        customer.setName("Potato");


        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setNumber("9849809399");
        phoneNumber.setType("homeeee");
        PhoneNumber phoneNumber1 = new PhoneNumber();
        phoneNumber1.setType("office");
        phoneNumber1.setNumber("9987678534");

        customer.addNumbers(phoneNumber);
        customer.addNumbers(phoneNumber1);

        repo.save(customer);
    }

    @Test
    @Transactional
    void getCustData() {
        Optional<Customer> customer = repo.findById(8);
        if (customer.isPresent()) {
            Customer customer1 = customer.get();
            System.out.println(customer1.getName());
            customer1.getNumbers().forEach(val -> System.out.println(val.getNumber()));
        }
    }

    @Test
    @Transactional
    @Rollback(value = false)
    void updateCustDate() {
        Customer customer = repo.getById(8);
        customer.setName("John Reddy");
        customer.getNumbers().forEach(val -> val.setType("satellite"));
        repo.save(customer);
    }

    @Test
    void deleteCustomerData() {
        repo.deleteById(8);
    }
}
