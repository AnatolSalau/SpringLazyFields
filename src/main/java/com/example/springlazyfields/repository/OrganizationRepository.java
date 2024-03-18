package com.example.springlazyfields.repository;

import com.example.springlazyfields.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization,Long> {
      @Query("SELECT org FROM Organization org join fetch org.head where org.id = :orgId")
      Organization getByIdFetchHead(@Param("orgId") long orgId);
}