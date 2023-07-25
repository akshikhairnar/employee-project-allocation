package com.example.employeeprojectallocation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    @Column(unique = true)
    private String departmentName;

    // One to Many relationships with Employee
    @JsonIgnore
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    //@OneToMany(mappedBy = "department")
    private List<Employee> employeeList = new ArrayList<>();
}
