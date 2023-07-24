package com.example.employeeprojectallocation.dto;

import com.example.employeeprojectallocation.entity.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
public class ProjectDTO {


    private Long id;

    private String name;

}
