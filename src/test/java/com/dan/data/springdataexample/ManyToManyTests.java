package com.dan.data.springdataexample;

import com.dan.data.springdataexample.entities.relationships.manytomany.Programmer;
import com.dan.data.springdataexample.entities.relationships.manytomany.Project;
import com.dan.data.springdataexample.repository.relationships.manytomany.ProgrammerRepository;
import com.dan.data.springdataexample.repository.relationships.manytomany.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@SpringBootTest
public class ManyToManyTests {

    @Autowired
    ProgrammerRepository repository;

    @Autowired
    ProjectRepository projectRepository;

    @Test
    public void testNewProgrammer() {
        Programmer programmer = new Programmer();
        programmer.setName("John");
        programmer.setSalary(10100129);

        Set<Project> projects = new HashSet<>();
        Project project = new Project();
        project.setName("Hibernate Project");
        projects.add(project);

        programmer.setProjects(projects);

        repository.save(programmer);
    }

    @Test
    public void testNewerProgrammer() {
        Programmer programmer = new Programmer();
        programmer.setName("Aaron");
        programmer.setSalary(500000);


        Set<Project> projects = new HashSet<>();
        Optional<Project> projectRepositoryById = projectRepository.findById(2);
        projectRepositoryById.ifPresent(projects::add);

        programmer.setProjects(projects);
        repository.save(programmer);
    }

    @Test
    @Transactional
    void testGetProgrammer() {
        Optional<Programmer> byId = repository.findById(3);
        if (byId.isPresent()) {
            Programmer programmer = byId.get();
            System.out.println("name: " + programmer.getName() + " salary: " + programmer.getSalary() + " id: " + programmer.getId());
            Set<Project> projects = programmer.getProjects();
            System.out.println(projects);
        }
    }
}
