package com.dan.data.springdataexample.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class CreditCard extends Payment {
    private String cardnumber;

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
}
