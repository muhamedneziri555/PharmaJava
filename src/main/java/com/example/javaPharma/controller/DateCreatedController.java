package com.example.javaPharma.controller;

import com.example.javaPharma.pojo.entity.DateCreated;
import com.example.javaPharma.service.DateCreatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/datecreated")
public class DateCreatedController {

    @Autowired
    private DateCreatedService dateCreatedService;

    @GetMapping
    public List<DateCreated> getAllDateCreated() {
        return dateCreatedService.getAllDateCreated();
    }

    @GetMapping("/{id}")
    public DateCreated getDateCreatedById(@PathVariable Long id) {
        return dateCreatedService.getDateCreatedById(id);
    }

    @PostMapping
    public DateCreated createDateCreated(@RequestBody DateCreated dateCreated) {
        return dateCreatedService.saveDateCreated(dateCreated);
    }

    @PutMapping("/{id}")
    public DateCreated updateDateCreated(@PathVariable Long id, @RequestBody DateCreated dateCreated) {
        dateCreated.setId(id);
        return dateCreatedService.saveDateCreated(dateCreated);
    }

    @DeleteMapping("/{id}")
    public void deleteDateCreated(@PathVariable Long id) {
        dateCreatedService.deleteDateCreated(id);
    }
}
