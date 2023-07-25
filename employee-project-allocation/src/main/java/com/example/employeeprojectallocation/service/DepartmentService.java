package com.example.employeeprojectallocation.service;


import com.example.employeeprojectallocation.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department getDepartmentByName(String name);
    List<Department> getAllDepartment();

    Department getDepartment(Long id);

    Department addDepartment(Department department);


    Department updateDepartment(Department department, Long id);

    void deleteDepartment(Long id);
}
