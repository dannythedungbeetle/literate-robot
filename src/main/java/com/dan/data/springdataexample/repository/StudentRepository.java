package com.dan.data.springdataexample.repository;

import com.dan.data.springdataexample.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    @Query("from Student")
    List<Student> findAllStudents();

    @Query("select st.firstName, st.lastName from Student st")
    List<Object[]> findStudentsPartialData();
}
