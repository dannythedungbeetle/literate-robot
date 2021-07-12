package com.dan.data.springdataexample.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * JPQL and Native SQL Demo
 *
 * @author v.daniel.gunturu
 */
@Entity
@Data
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "fname")
    String firstName;
    @Column(name = "lname")
    String lastName;
    Integer score;
}
