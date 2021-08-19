package com.dan.data.springdataexample.entities.relationships.onetomany;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<PhoneNumber> numbers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PhoneNumber> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<PhoneNumber> numbers) {
        this.numbers = numbers;
    }

    public void addNumbers(PhoneNumber number) {
        if (numbers == null) {
            numbers = new HashSet<>();
        }
        number.setCustomer(this);
        numbers.add(number);
    }
}
