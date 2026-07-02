package com.cognizant.handson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.handson4.model.Employee;
import com.cognizant.handson4.service.EmployeeService;

@SpringBootApplication
public class HandsOn4Application implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(HandsOn4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Employee employee = new Employee(101, "Monika", 50000);

        employeeService.addEmployee(employee);
    }
}