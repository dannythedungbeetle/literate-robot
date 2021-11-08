package com.dan.data.springdataexample.repository.componentmapping;

import com.dan.data.springdataexample.entities.componentmapping.EmployeeComponent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentEmployeeRepository extends JpaRepository<EmployeeComponent, Integer> {
}
