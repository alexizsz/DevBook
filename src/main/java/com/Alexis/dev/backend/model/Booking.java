package com.Alexis.dev.backend.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="bookings")
public class Booking {

    public Booking(Long id, Company company, List<Product> products, Location location) {
        this.id = id;
        this.company = company;
        this.products = products;
        this.location = location;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Company company;

    @OneToMany(mappedBy = "booking")
    private List<Product> products;

    @ManyToOne
    private Location location;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
