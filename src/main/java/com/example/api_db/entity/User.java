package com.example.api_db.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class User {

    private @Id @GeneratedValue Long id;
    private String name;
    private String email;

    public User(String name, String email) {
        super();
        this.name=name;
        this.email=email;

    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public String getEmail() {
        return email;
    }

}
