package com.example.springlazyfields.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.HashSet;
import java.util.Set;

@Data
@Accessors(chain = true)
@NoArgsConstructor

@Entity
@Table(name = "org")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(targetEntity = Employee.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "head_id")
    private Employee head;
  
    @OneToMany(targetEntity = Employee.class, mappedBy = "organization", fetch = FetchType.LAZY)
    private Set<Employee> employees = new HashSet();
  
    @OneToOne(targetEntity = OrganizationCodes.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "code_id")
    private OrganizationCodes codes;
}