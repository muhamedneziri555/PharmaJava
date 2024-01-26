package com.example.javaPharma.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name= "expiryDate")
public class ExpiryDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date; // You might want to use the appropriate date type based on your requirements

    // getters and setters

    @OneToMany(mappedBy = "expiryDate")
    @JsonBackReference
    private Set<Medicine> medicines;

    public ExpiryDate() {
    }

    public ExpiryDate(Long id, String date, Set<Medicine> medicines) {
        this.id = id;
        this.date = date;
        this.medicines = medicines;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Set<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(Set<Medicine> medicines) {
        this.medicines = medicines;
    }
}
