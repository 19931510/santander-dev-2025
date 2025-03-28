package com.cursodio.santander_dev_2025.domain.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", scale = 2, precision = 13)
    private BigDecimal Limit    ;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public BigDecimal getLimit() {
        return Limit;
    }
    public void setLimit(BigDecimal limit) {
        Limit = limit;
    }
}

