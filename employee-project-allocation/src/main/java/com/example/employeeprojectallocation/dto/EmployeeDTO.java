package com.example.employeeprojectallocation.dto;

import lombok.Data;

@Data
public class EmployeeDTO {

    private Long empId;

    private String firstName;

    private String lastName;

    private DepartmentDTO departmentDTO;

}
