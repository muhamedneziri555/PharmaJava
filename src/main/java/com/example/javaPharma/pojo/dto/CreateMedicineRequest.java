package com.example.javaPharma.pojo.dto;

public class CreateMedicineRequest {

    private String name;

    public CreateMedicineRequest(String name) {
        this.name = name;
    }

    public CreateMedicineRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

