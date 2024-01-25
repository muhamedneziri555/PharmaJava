package com.example.javaPharma.service;


import com.example.javaPharma.pojo.entity.Medicine;
import com.example.javaPharma.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    @Override
    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }

    @Override
    public Medicine getMedicineById(Long id) {
        return medicineRepository.findById(id).orElse(null);
    }

    @Override
    public List<Medicine> searchByName(String name) {
        return medicineRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public List<Medicine> searchByCategory(String category) {
        List<Medicine> allMedicines = medicineRepository.findAll();
        return allMedicines.stream()
                .filter(medicine -> medicine.getCategory() != null && medicine.getCategory().getName().contains(category))
                .collect(Collectors.toList());
    }

    @Override
    public List<Medicine> searchByManufacturer(String manufacturer) {
        List<Medicine> allMedicines = medicineRepository.findAll();
        return allMedicines.stream()
                .filter(medicine -> medicine.getManufacturer() != null && medicine.getManufacturer().getName().contains(manufacturer))
                .collect(Collectors.toList());
    }

    @Override
    public List<Medicine> searchByDateCreated(Date dateCreated) {
        List<Medicine> allMedicines = medicineRepository.findAll();
        return allMedicines.stream()
                .filter(medicine -> medicine.getDateCreated() != null && medicine.getDateCreated().getDate().equals(dateCreated))
                .collect(Collectors.toList());
    }

    @Override
    public List<Medicine> searchByExpiryDate(Date expiryDate) {
        List<Medicine> allMedicines = medicineRepository.findAll();
        return allMedicines.stream()
                .filter(medicine -> medicine.getExpiryDate() != null && medicine.getExpiryDate().getDate().equals(expiryDate))
                .collect(Collectors.toList());
    }


    @Override
    public Medicine saveMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @Override
    public void deleteMedicine(Long id) {
        medicineRepository.deleteById(id);
    }
}
