package com.example.employeeprojectallocation.controller;

import com.example.employeeprojectallocation.service.serviceimpl.ProjectAllocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/project-allocation")
public class ProjectAllocationController {

    @Autowired
    private ProjectAllocationServiceImpl projectAllocationService;

    @PostMapping("{projectId}/{employeeId}/{allocationDate}")
    public ResponseEntity<HttpStatus> projectAllocation(@PathVariable("projectId") Long projectId, @PathVariable("employeeId") Long employeeId, @PathVariable("allocationDate")LocalDate allocationDate){
        projectAllocationService.projectAllocation(projectId,employeeId,allocationDate);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
