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
}