package com.example.javaPharma.service;

import com.example.javaPharma.pojo.entity.DateCreated;

import java.util.List;

public interface DateCreatedService {
    List<DateCreated> getAllDateCreatedEntries();

    DateCreated getDateCreatedById(Long id);

    DateCreated saveDateCreated(DateCreated dateCreated);

    void deleteDateCreated(Long id);

    List<DateCreated> getAllDateCreated();
}
