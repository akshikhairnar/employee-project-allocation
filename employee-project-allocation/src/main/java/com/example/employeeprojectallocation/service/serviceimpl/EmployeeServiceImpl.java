package com.example.employeeprojectallocation.service.serviceimpl;

import com.example.employeeprojectallocation.entity.Employee;
import com.example.employeeprojectallocation.exceptions.employeeexceptions.EmployeeAlreadyExistsException;
import com.example.employeeprojectallocation.exceptions.employeeexceptions.NoSuchEmployeeExistsException;
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
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new NoSuchEmployeeExistsException("No Employee Exist With Id : " + id));
    }

    @Override
    public Employee addEmployee(Employee employee) {
        Employee existEmployee = getEmployee(employee.getEmpId());
        if (existEmployee == null) {
            return employeeRepository.save(employee);
        } else {
            throw new EmployeeAlreadyExistsException("Employee Already Exist With Id : " + existEmployee.getEmpId());
        }
    }

    @Override
    public Employee updateEmployee(Employee employee, Long id) {
        Employee existedEmployee = getEmployee(id);
        if (existedEmployee != null) {
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public void deleteAllEmployees() {
        employeeRepository.deleteAll();
    }


}
