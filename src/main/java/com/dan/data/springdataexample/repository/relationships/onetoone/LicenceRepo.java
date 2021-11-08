package com.dan.data.springdataexample.repository.relationships.onetoone;

import com.dan.data.springdataexample.entities.onetoone.License;
import org.springframework.data.repository.CrudRepository;

public interface LicenceRepo extends CrudRepository<License, Long> {

}
