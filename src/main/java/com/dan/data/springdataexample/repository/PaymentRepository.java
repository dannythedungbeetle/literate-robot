package com.dan.data.springdataexample.repository;

import com.dan.data.springdataexample.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
