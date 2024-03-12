package com.example.springlazyfields.repository;

import com.example.springlazyfields.model.Employee;
import com.example.springlazyfields.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Set<Employee> findByOrganization(Organization organization);
}