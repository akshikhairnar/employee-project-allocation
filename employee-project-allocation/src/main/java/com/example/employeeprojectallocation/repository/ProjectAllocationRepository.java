package com.example.employeeprojectallocation.repository;

import com.example.employeeprojectallocation.entity.ProjectAllocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectAllocationRepository extends JpaRepository<ProjectAllocation, Long> {
}
