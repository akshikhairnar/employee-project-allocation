package com.example.employeeprojectallocation.dto;

import com.example.employeeprojectallocation.entity.Department;
import com.example.employeeprojectallocation.entity.Project;
import com.example.employeeprojectallocation.entity.ProjectAllocation;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class EmployeeDTO {

    private Long empId;

    private String firstName;

    private String lastName;

    private DepartmentDTO departmentDTO;

   // private Set<ProjectAllocation> projectAllocation;

   // private Set<Project> projects = new HashSet<>();
}
