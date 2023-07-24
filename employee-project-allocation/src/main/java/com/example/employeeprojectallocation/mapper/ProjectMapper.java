package com.example.employeeprojectallocation.mapper;

import com.example.employeeprojectallocation.dto.ProjectDTO;
import com.example.employeeprojectallocation.entity.Project;

public class ProjectMapper {

    public static Project mapToProject(ProjectDTO projectdto) {
        Project project = new Project();
        project.setId(projectdto.getId());
        project.setName(projectdto.getName());
        return project;
    }

    public static ProjectDTO mapToProjectDTO(Project project) {
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setId(project.getId());
        projectDTO.setName(project.getName());
        return projectDTO;
    }
}
