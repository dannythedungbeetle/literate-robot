package com.dan.data.springdataexample.repository;

import com.dan.data.springdataexample.entities.inheritancesuper.SuperPayment;
import org.springframework.data.repository.CrudRepository;

public interface SuperPaymentRepo extends CrudRepository<SuperPayment, Integer> {

}
