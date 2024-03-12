package com.example.springlazyfields.services;

import com.example.springlazyfields.model.Organization;
import com.example.springlazyfields.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository repository;

    @Autowired
    public OrganizationServiceImpl(OrganizationRepository repository){
        this.repository = repository;
    }

    @Override
    public Organization getById(long orgId) {
        return repository.getById(orgId);
    }
}