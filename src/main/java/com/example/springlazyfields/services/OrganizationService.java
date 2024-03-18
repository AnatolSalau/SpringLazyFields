package com.example.springlazyfields.services;

import com.example.springlazyfields.model.Organization;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrganizationService {
      public Organization getById(long orgId);

      String getHeadNameFromOrgTransactional(long orgId);

      String getHeadNameFromOrgJpaQueryJoinFetch(long orgId);

}
