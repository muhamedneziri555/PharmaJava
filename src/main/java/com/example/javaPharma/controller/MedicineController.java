package com.example.javaPharma.controller;


import com.example.javaPharma.pojo.dto.CreateMedicineRequest;
import com.example.javaPharma.pojo.entity.Medicine;
import com.example.javaPharma.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @GetMapping
    public List<Medicine> getAllMedicines() {
        return medicineService.getAllMedicines();
    }

    @GetMapping("/{id}")
    public Medicine getMedicineById(@PathVariable Long id) {
        return medicineService.getMedicineById(id);
    }

    @GetMapping("/search")
    public List<Medicine> searchMedicineByName(@RequestParam String name) {
        return medicineService.searchByName(name);
    }

    @PostMapping
    public Medicine createMedicine(@RequestBody CreateMedicineRequest medicine) {
        return medicineService.saveMedicine(medicine);
    }

    @PutMapping("/{id}")
    public Medicine updateMedicine(@PathVariable Long id, @RequestBody CreateMedicineRequest medicine) {
        var existingMedicine = medicineService.getMedicineById(id);
        existingMedicine.setName(medicine.getName());
        return medicineService.saveMedicine(medicine);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicine(@PathVariable Long id) {
        medicineService.deleteMedicine(id);
    }
}
