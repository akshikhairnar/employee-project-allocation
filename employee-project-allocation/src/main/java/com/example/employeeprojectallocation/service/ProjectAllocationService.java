package com.example.employeeprojectallocation.service;

import java.time.LocalDate;

public interface ProjectAllocationService {
    void projectAllocation(Long projectId, Long employeeId, LocalDate allocationDate);
}
