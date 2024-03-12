package com.example.springlazyfields.services;

import com.example.springlazyfields.model.Employee;
import com.example.springlazyfields.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {
      private final EmployeeRepository employeeRepository;


      @Autowired
      public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
            this.employeeRepository = employeeRepository;
      }

      @Override
      public Employee getById(long employeeId) {
            return employeeRepository.findById(employeeId).get();
      }

      @Override
      public Set<Employee> getByOrgId(long orgId) {
            return  null;
      }
}
