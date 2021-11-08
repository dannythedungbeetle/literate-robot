package com.dan.data.springdataexample.entities.componentmapping;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String city;
    private String streetaddress;
    private String zipcode;
    private String country;
    private String state;

}
