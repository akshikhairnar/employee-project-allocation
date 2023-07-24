package com.example.employeeprojectallocation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Table(name = "Employee")
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;

    private String firstName;

    private String lastName;

    //@NotNull
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToMany(mappedBy = "employee", cascade = {CascadeType.ALL})
    private Set<ProjectAllocation> projectAllocations;

   // @JsonIgnore
   // @ManyToMany(cascade = { CascadeType.ALL})
//    @JoinTable(
//            name="employee_project",
//            joinColumns =  { @JoinColumn(name = "employee_id")},
//            inverseJoinColumns = { @JoinColumn (name = "project_id") }
//    )
//    private Set<Project> projects=new HashSet<>();




}
