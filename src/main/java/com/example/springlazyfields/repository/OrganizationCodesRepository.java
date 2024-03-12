package com.example.springlazyfields.repository;

import com.example.springlazyfields.model.OrganizationCodes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationCodesRepository extends JpaRepository<OrganizationCodes, Long> {
}