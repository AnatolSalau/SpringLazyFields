package com.example.springlazyfields.services;

import com.example.springlazyfields.model.Organization;

public interface OrganizationService {
      public Organization getById(long orgId);

      String getHeadNameFromOrgTransactional(long orgId);
}
