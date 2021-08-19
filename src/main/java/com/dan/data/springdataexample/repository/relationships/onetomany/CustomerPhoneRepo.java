package com.dan.data.springdataexample.repository.relationships.onetomany;

import com.dan.data.springdataexample.entities.relationships.onetomany.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerPhoneRepo extends JpaRepository<Customer, Integer> {
}
