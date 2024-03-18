package com.example.springlazyfields.services;

import com.example.springlazyfields.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrganizationServiceImplTest {

      @Autowired
      OrganizationService organizationService;

      @Test
      void getHeadNameFromOrgTest() {
            Long orgId = 1L;
            Employee head = organizationService.getById(orgId).getHead();
            System.out.println("Employee : " + head);
      }

      @Test
      void getHeadNameFromOrg() {
            Long orgId = 1L;
            String headNameFromOrg = organizationService.getHeadNameFromOrgTransactional(orgId);
            System.out.println("Head name : " + headNameFromOrg);
      }
}