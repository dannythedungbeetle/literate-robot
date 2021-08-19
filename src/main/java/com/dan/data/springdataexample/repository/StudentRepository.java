package com.dan.data.springdataexample.repository;

import com.dan.data.springdataexample.entities.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    @Query("from Student")
    List<Student> findAllStudents();

    @Query("from Student")
    List<Student> findAllStudents(Pageable pageable);

    @Query("select st.firstName, st.lastName from Student st")
    List<Object[]> findStudentsPartialData();

    @Query("from Student where firstName=:firstName")
    List<Student> getStudentByFirstName(@Param("firstName") String fName);

    @Query("from Student where score>:min AND score<:max")
    List<Student> getStudentsInScoreRange(@Param("min") int min, @Param("max") int max);

    @Modifying
    @Query("delete from Student where firstName=:firstName")
    void deleteStudentsByFirstName(@Param("firstName") String firstName);

    @Query(value = "select * from student where fname like :fName%", nativeQuery = true)
    List<Student> findAllStudentsWithFirstNameLikeNative(@Param("fName") String firstName);

    long countByASampleFirstName(String firstName);
}
