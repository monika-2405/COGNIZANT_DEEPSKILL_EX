package com.cognizant.handson4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.handson4.model.Employee;
import com.cognizant.handson4.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
        System.out.println("Employee saved successfully.");
    }
}