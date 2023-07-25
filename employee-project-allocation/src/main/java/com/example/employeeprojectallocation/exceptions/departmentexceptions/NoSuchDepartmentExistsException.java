package com.example.employeeprojectallocation.exceptions.departmentexceptions;

public class NoSuchDepartmentExistsException extends RuntimeException{

    private String message;

    public NoSuchDepartmentExistsException(){}

    public NoSuchDepartmentExistsException(String msg){
        super(msg);
        this.message=msg;
    }
}
