package com.example.employeeprojectallocation.exceptions.employeeexceptions;

public class NoSuchEmployeeExistsException extends RuntimeException {

    private String message;

    public NoSuchEmployeeExistsException() {
    }

    public NoSuchEmployeeExistsException(String msg) {
        super(msg);
        this.message = msg;
    }
}
