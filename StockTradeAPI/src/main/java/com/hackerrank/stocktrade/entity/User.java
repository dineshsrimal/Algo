package com.hackerrank.stocktrade.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {
    @Id
    private Long id;
    private String name;


    
    public User() {
    }
    
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
