package com.example.employeeprojectallocation.service.ServiceImpl;

import com.example.employeeprojectallocation.entity.Employee;
import com.example.employeeprojectallocation.repository.EmployeeRepository;
import com.example.employeeprojectallocation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    @Override
    public Employee getEmployee(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow();
        return employee;

    }

    @Override
    public Employee addEmployee(Employee employee) {
        Employee employeeAdded = employeeRepository.save(employee);
        return employeeAdded;
    }

    @Override
    public Employee updateEmployee(Employee employee, Long id) {
        if (id == employee.getEmpId()) {

            Employee updatedEmployee = employeeRepository.save(employee);
            return updatedEmployee;
        }
        return null;
    }

    @Override
    public void deleteAllEmployees() {
        employeeRepository.deleteAll();
    }


}
