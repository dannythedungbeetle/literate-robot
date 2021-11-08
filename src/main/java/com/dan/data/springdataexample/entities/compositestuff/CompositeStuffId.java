package com.dan.data.springdataexample.entities.compositestuff;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@ToString
public class CompositeStuffId implements Serializable {
    private String firstName;
    private String lastName;


}
