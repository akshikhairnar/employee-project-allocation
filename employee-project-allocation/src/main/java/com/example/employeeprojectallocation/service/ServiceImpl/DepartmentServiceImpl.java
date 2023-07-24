package com.example.employeeprojectallocation.service.ServiceImpl;

import com.example.employeeprojectallocation.dto.DepartmentDTO;
import com.example.employeeprojectallocation.entity.Department;
import com.example.employeeprojectallocation.mapper.DepartmentMapper;
import com.example.employeeprojectallocation.repository.DepartmentRepository;
import com.example.employeeprojectallocation.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartment() {
        List<Department> departments = departmentRepository.findAll();
        return departments;
    }

    @Override
    public Department getDepartment(Long id) {
        Department department = departmentRepository.findById(id).orElseThrow();
        return department;
    }

    @Override
    public Department addDepartment(Department department) {
        Department saveDepartment = departmentRepository.save(department);
        return saveDepartment;
    }

    @Override
    public Department updateDepartment(Department department, Long id) {
        Department departmentToUpdate = departmentRepository.findById(id).orElseThrow();
        departmentToUpdate.setDepartmentName(department.getDepartmentName());
        Department updatedDepartment = departmentRepository.save(departmentToUpdate);
        return updatedDepartment;
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
