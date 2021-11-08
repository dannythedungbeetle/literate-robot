package com.dan.data.springdataexample.repository.compositestuff;

import com.dan.data.springdataexample.entities.compositestuff.CompositeStuff;
import com.dan.data.springdataexample.entities.compositestuff.CompositeStuffId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompositeStuffRepository extends JpaRepository<CompositeStuff, CompositeStuffId> {

}
