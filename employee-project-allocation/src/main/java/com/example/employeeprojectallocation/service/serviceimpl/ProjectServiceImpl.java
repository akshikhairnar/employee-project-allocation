package com.example.employeeprojectallocation.service.serviceimpl;

import com.example.employeeprojectallocation.entity.Project;
import com.example.employeeprojectallocation.exceptions.projectexceptions.NoSuchProjectExistsException;
import com.example.employeeprojectallocation.exceptions.projectexceptions.ProjectAlreadyExistException;
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
        Project existingProject = projectRepository.findByName(project.getName());
        if (existingProject == null) {
            return projectRepository.save(project);
        } else {
            throw new ProjectAlreadyExistException("Project Already Exist");
        }


    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project updateProject(Project project, Long id) {
        Project projectToUpdate = findByProjectId(id);
        projectToUpdate.setName(project.getName());
        return projectRepository.save(project);
    }

    @Override
    public Project findByProjectId(Long id) {
        return projectRepository.findById(id).orElseThrow(() -> new NoSuchProjectExistsException("Project Not Exist With ID " + id));
    }

    @Override
    public void deleteProjectById(Long id) {
        Project projectToDelete = findByProjectId(id);
        if (projectToDelete!=null) {
            projectRepository.deleteById(id);
        }
    }


}
