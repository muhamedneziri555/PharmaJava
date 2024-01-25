package com.example.javaPharma.pojo.entity;


import jakarta.persistence.*;

@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;

    @ManyToOne
    @JoinColumn(name = "date_created_id")
    private DateCreated dateCreated;

    @ManyToOne
    @JoinColumn(name = "expiry_date_id")
    private ExpiryDate expiryDate;

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public DateCreated getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(DateCreated dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ExpiryDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(ExpiryDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}