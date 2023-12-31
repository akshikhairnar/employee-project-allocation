package com.example.employeeprojectallocation.controller;

import com.example.employeeprojectallocation.dto.ProjectDTO;
import com.example.employeeprojectallocation.entity.Project;
import com.example.employeeprojectallocation.mapper.ProjectMapper;
import com.example.employeeprojectallocation.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping
    public ResponseEntity<ProjectDTO> addProject(@RequestBody ProjectDTO projectDTO) {
        Project projectToAdd = ProjectMapper.mapToProject(projectDTO);
        Project project = projectService.addProject(projectToAdd);
        ProjectDTO projectDTOAdded = ProjectMapper.mapToProjectDTO(project);
        return new ResponseEntity<>(projectDTOAdded, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Project>> getAllProjects() {
        List<Project> projects = projectService.getAllProjects();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectDTO> getProjectById(@PathVariable("id") Long id) {
        Project project = projectService.findByProjectId(id);
        ProjectDTO projectDTO = ProjectMapper.mapToProjectDTO(project);
        return new ResponseEntity<>(projectDTO, HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<ProjectDTO> updateProject(@RequestBody ProjectDTO projectDTO, @PathVariable("id") Long id) {
        Project projectToUpdate = ProjectMapper.mapToProject(projectDTO);
        Project updatedProject = projectService.updateProject(projectToUpdate, id);
        ProjectDTO updatedProjectDTO = ProjectMapper.mapToProjectDTO(updatedProject);
        return new ResponseEntity<>(updatedProjectDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteProject(@PathVariable("id") Long id) {
        projectService.deleteProjectById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
