package com.Alexis.dev.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="companies")
public class Company {

    public Company(Long id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String contact;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}
