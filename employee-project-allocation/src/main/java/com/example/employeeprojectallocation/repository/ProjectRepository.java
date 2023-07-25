package com.example.employeeprojectallocation.repository;

import com.example.employeeprojectallocation.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {

    Project findByName(String name);
}
