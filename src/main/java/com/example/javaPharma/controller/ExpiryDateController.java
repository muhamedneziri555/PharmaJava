package com.example.javaPharma.controller;

import com.example.javaPharma.pojo.dto.CreateExpiryDateRequest;
import com.example.javaPharma.pojo.entity.ExpiryDate;
import com.example.javaPharma.service.ExpiryDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expirydates")
public class ExpiryDateController {

    @Autowired
    private ExpiryDateService expiryDateService;

    @GetMapping
    public List<ExpiryDate> getAllExpiryDates() {
        return expiryDateService.getAllExpiryDates();
    }

    @GetMapping("/{id}")
    public ExpiryDate getExpiryDateById(@PathVariable Long id) {
        return expiryDateService.getExpiryDateById(id);
    }

    @PostMapping
    public ExpiryDate createExpiryDate(@RequestBody CreateExpiryDateRequest expiryDate) {
        return expiryDateService.saveExpiryDate(expiryDate);
    }

    @DeleteMapping("/{id}")
    public void deleteExpiryDate(@PathVariable Long id) {
        expiryDateService.deleteExpiryDate(id);
    }
}
