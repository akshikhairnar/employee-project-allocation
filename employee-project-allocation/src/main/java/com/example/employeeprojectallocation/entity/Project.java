package com.example.employeeprojectallocation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "Projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "project")
    private Set<ProjectAllocation> projectAllocations;

    //@ManyToMany(mappedBy = "projects")
    //@JsonIgnore
    //private Set<Employee> employees=new HashSet<>();


}
