package com.example.javaPharma.controller;

import com.example.javaPharma.pojo.dto.CreateManufacturerRequest;
import com.example.javaPharma.pojo.entity.Manufacturer;
import com.example.javaPharma.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/manufacturers")
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufacturerService;

    @GetMapping
    public List<Manufacturer> getAllManufacturers() {
        return manufacturerService.getAllManufacturers();
    }

    @GetMapping("/{id}")
    public Manufacturer getManufacturerById(@PathVariable Long id) {
        return manufacturerService.getManufacturerById(id);
    }

    @PostMapping
    public Manufacturer createManufacturer(@RequestBody CreateManufacturerRequest manufacturer) {
        return manufacturerService.saveManufacturer(manufacturer);
    }


    @DeleteMapping("/{id}")
    public void deleteManufacturer(@PathVariable Long id) {
        manufacturerService.deleteManufacturer(id);
    }
}
