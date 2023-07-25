package com.example.employeeprojectallocation.service.serviceimpl;

import com.example.employeeprojectallocation.entity.Employee;
import com.example.employeeprojectallocation.entity.Project;
import com.example.employeeprojectallocation.entity.ProjectAllocation;
import com.example.employeeprojectallocation.repository.ProjectAllocationRepository;
import com.example.employeeprojectallocation.service.ProjectAllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ProjectAllocationServiceImpl implements ProjectAllocationService {
    @Autowired
    private ProjectAllocationRepository projectAllocationRepository;

    @Autowired
    private EmployeeServiceImpl employeeService;

    @Autowired
    private ProjectServiceImpl projectService;


    @Override
    public void projectAllocation(Long projectId, Long employeeId, LocalDate allocationDate) {

        Employee employee = employeeService.getEmployee(employeeId);

        Project project = projectService.findByProjectId(projectId);

        if (employee != null && project != null) {
            ProjectAllocation projectAllocation = new ProjectAllocation();
            projectAllocation.setProject(project);
            projectAllocation.setEmployee(employee);
            projectAllocation.setAllocationDate(allocationDate);

            projectAllocationRepository.save(projectAllocation);
        }

    }
}
