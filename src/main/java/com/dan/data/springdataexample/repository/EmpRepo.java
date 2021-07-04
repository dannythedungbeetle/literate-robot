package com.dan.data.springdataexample.repository;

import com.dan.data.springdataexample.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepo extends CrudRepository<Employee, Integer> {

}
