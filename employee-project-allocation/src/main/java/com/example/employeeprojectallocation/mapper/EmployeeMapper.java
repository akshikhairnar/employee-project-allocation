package com.example.employeeprojectallocation.mapper;

import com.example.employeeprojectallocation.dto.EmployeeDTO;
import com.example.employeeprojectallocation.entity.Employee;

public class EmployeeMapper {

    private EmployeeMapper(){}

    public static Employee employeeMapper(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setEmpId(employeeDTO.getEmpId());
        employee.setDepartment(DepartmentMapper.departmentMapper(employeeDTO.getDepartmentDTO()));
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        return employee;
    }

    public static EmployeeDTO employeeDTOMapper(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpId(employee.getEmpId());
        employeeDTO.setDepartmentDTO(DepartmentMapper.departmentDTOMapper(employee.getDepartment()));
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setLastName(employee.getLastName());
        return employeeDTO;
    }
}
