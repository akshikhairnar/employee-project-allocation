package com.example.employeeprojectallocation.repository;

import com.example.employeeprojectallocation.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee save(Employee employee);

}
