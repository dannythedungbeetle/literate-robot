package com.dan.data.springdataexample.repository.relationships.manytomany;

import com.dan.data.springdataexample.entities.relationships.manytomany.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
