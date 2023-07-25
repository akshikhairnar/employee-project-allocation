package com.example.employeeprojectallocation.mapper;

import com.example.employeeprojectallocation.dto.DepartmentDTO;
import com.example.employeeprojectallocation.entity.Department;

public class DepartmentMapper {

    private DepartmentMapper(){}
    public static Department departmentMapper(DepartmentDTO departmentDTO) {
        Department department = new Department();
        department.setDepartmentId(departmentDTO.getDepartmentId());
        department.setDepartmentName(departmentDTO.getDepartmentName());
        return department;
    }

    public static DepartmentDTO departmentDTOMapper(Department department) {
        DepartmentDTO departmentDTO = new DepartmentDTO();
        departmentDTO.setDepartmentId(department.getDepartmentId());
        departmentDTO.setDepartmentName(department.getDepartmentName());
        return departmentDTO;
    }
}
