package com.example.employeeprojectallocation.service;

import com.example.employeeprojectallocation.entity.Project;

import java.util.List;

public interface ProjectService {
    Project addProject(Project project);

    List<Project> getAllProjects();

    Project updateProject(Project project, Long id);

    Project findByProjectId(Long id);

    void deleteProjectById(Long id);


}
