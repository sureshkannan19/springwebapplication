package com.sk.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final DepartmentService departmentService;
    public EmployeeService(@Lazy DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
}