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

        Organization organization = repository.findById(orgId).get();

        return organization;
    }

    @Transactional
    @Override
    public String getHeadNameFromOrgTransactional(long orgId) {
        Organization  org = repository.findById(orgId).get();
        Employee head = org.getHead();
        return head.getFirstName();
    }

    @Override
    public String getHeadNameFromOrgJpaQueryJoinFetch(long orgId) {
        Employee head = repository.getByIdFetchHead(orgId).getHead();
        return head.getFirstName();
    }
}