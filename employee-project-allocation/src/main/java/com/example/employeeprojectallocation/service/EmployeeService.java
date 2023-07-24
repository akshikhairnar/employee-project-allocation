package com.example.employeeprojectallocation.service;

import com.example.employeeprojectallocation.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    Employee getEmployee(Long id);

    Employee addEmployee(Employee e);

    Employee updateEmployee(Employee e, Long id);

    void deleteAllEmployees();


}
