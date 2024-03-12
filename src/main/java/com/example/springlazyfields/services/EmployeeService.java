package com.example.springlazyfields.services;

import com.example.springlazyfields.model.Employee;

import java.util.Set;

public interface EmployeeService {
    Employee getById(long employeeId);
    Set<Employee> getByOrgId(long orgId);
}