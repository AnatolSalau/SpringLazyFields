package com.example.springlazyfields.services;

import com.example.springlazyfields.model.OrganizationCodes;
import com.example.springlazyfields.repository.OrganizationCodesRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrganizationCodesServiceImpl implements OrganizationCodesService {
      private  final OrganizationCodesRepository organizationCodesRepository;

      @Autowired
      public OrganizationCodesServiceImpl(OrganizationCodesRepository organizationCodesRepository) {
            this.organizationCodesRepository = organizationCodesRepository;
      }

      @Override
      public OrganizationCodes getById(long id) {
            return organizationCodesRepository.findById(id).get();
      }
}
