package com.example.employeeprojectallocation.service.ServiceImpl;

import com.example.employeeprojectallocation.entity.Project;
import com.example.employeeprojectallocation.repository.ProjectRepository;
import com.example.employeeprojectallocation.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project updateProject(Project project, Long id) {
        Project projectToUpdate = projectRepository.findById(id).orElseThrow();
        projectToUpdate.setName(project.getName());
        return projectRepository.save(project);
    }

    @Override
    public Project findByProjectId(Long id) {
        return projectRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteProjectById(Long id) {
        if (!projectRepository.findById(id).isEmpty()) {
            projectRepository.deleteById(id);
        } else {
            //  TODO - logger
        }

        //return null;
    }


}
