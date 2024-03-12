package com.example.springlazyfields.services;

import com.example.springlazyfields.model.Employee;
import com.example.springlazyfields.model.Organization;
import com.example.springlazyfields.repository.EmployeeRepository;
import com.example.springlazyfields.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {
      private final EmployeeRepository employeeRepository;
      private final OrganizationRepository organizationRepository;


      @Autowired
      public EmployeeServiceImpl(EmployeeRepository employeeRepository, OrganizationRepository organizationRepository) {
            this.employeeRepository = employeeRepository;
            this.organizationRepository = organizationRepository;
      }

      @Override
      public Employee getById(long employeeId) {
            return employeeRepository.findById(employeeId).get();
      }

      @Override
      public Set<Employee> getByOrgId(long orgId) {
            Organization organization = organizationRepository.findById(orgId).get();
            Set<Employee> employees = organization.getEmployees();
            return  employees;
      }
}
