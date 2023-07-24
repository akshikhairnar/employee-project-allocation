package com.example.employeeprojectallocation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.jackson.JsonComponent;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="Departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    @Column(unique = true)
    private String departmentName;

    // One to Many relationships with Employee
    @JsonIgnore
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Employee> employeeList= new ArrayList<>();
}
