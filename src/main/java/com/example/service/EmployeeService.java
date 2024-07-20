package com.example.service;

import com.example.domain.Employee;
import com.example.exception.ResourceNotFoundException;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Employee createEmployee( Employee employee) {
        return repository.save(employee);
    }

    public Employee updateEmployee(String id, Employee employee) {
        Optional<Employee> existingEmployee = repository.findById(id);
        if (existingEmployee.isPresent()) {
            employee.setId(id);
            return repository.save(employee);
        } else {
            throw new ResourceNotFoundException("Employee not found with id " + id);
        }
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(String id) {
        return repository.findById(id);
    }
}
