package com.example.springlazyfields.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Entity
@NoArgsConstructor
@Table(name = "employee")
public class OrganizationCodes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "inn", nullable = false)
    private String inn;
    
    @Column(name = "kpp", nullable = false)
    private String kpp;
    
    @Column(name = "ogrn", nullable = false)
    private String ogrn;
}