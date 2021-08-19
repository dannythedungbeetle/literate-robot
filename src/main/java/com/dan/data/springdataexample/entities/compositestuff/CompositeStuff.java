package com.dan.data.springdataexample.entities.compositestuff;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CompositeStuff {
    @EmbeddedId
    CompositeStuffId compositeStuffId;
    String phone;
}
