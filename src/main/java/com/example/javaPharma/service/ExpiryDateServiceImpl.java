package com.example.javaPharma.service;


import com.example.javaPharma.pojo.entity.ExpiryDate;
import com.example.javaPharma.repository.ExpiryDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpiryDateServiceImpl implements ExpiryDateService {

    @Autowired
    private ExpiryDateRepository expiryDateRepository;

    @Override
    public List<ExpiryDate> getAllExpiryDates() {
        return expiryDateRepository.findAll();
    }

    @Override
    public ExpiryDate getExpiryDateById(Long id) {
        return expiryDateRepository.findById(id).orElse(null);
    }

    @Override
    public ExpiryDate saveExpiryDate(ExpiryDate expiryDate) {
        return expiryDateRepository.save(expiryDate);
    }

    @Override
    public void deleteExpiryDate(Long id) {
        expiryDateRepository.deleteById(id);
    }
}