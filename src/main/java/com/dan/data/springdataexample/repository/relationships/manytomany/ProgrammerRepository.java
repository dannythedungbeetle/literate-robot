package com.dan.data.springdataexample.repository.relationships.manytomany;

import com.dan.data.springdataexample.entities.relationships.manytomany.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammerRepository extends JpaRepository<Programmer, Integer> {
}
