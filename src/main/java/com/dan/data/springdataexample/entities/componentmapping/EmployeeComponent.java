package com.dan.data.springdataexample.entities.componentmapping;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeComponent {
    @Id
    private Integer id;
    private String name;
    @Embedded
    private Address address;

}
