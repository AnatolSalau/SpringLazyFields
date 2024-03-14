package com.example.springlazyfields.services;

import com.example.springlazyfields.model.Employee;
import com.example.springlazyfields.model.Organization;
import com.example.springlazyfields.repository.OrganizationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository repository;

    @Autowired
    public OrganizationServiceImpl(OrganizationRepository repository){
        this.repository = repository;
    }

    @Override
    public Organization getById(long orgId) {
        return repository.findById(orgId).get();
    }

    @Transactional
    @Override
    public String getHeadNameFromOrg(long orgId) {
        Organization  org = repository.findById(orgId).get();
        Employee head = org.getHead();
        return head.getFirstName();
    }
}