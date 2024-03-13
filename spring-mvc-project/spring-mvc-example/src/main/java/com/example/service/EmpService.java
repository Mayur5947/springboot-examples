package com.example.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;

@Service
public class EmpService {

    @Autowired
    private EmpRepository repository;

    public List<Employee> retriveEmployees() throws SQLException {
        System.out.println("in service");
        List<Employee> employees = repository.retriveEmployees();
        return employees;
    }

    public void addEmployee(Employee employee) throws SQLException {
        repository.addEmployee(employee);
    }

    public Employee retriveEmployee(int id) throws SQLException {
        return  repository.retriveEmployee(id);
    }

    public void updateEmployee(Employee employee) throws SQLException {
        repository.updateEmployee(employee);
    }

    public void deleteEmployee(int id) throws SQLException {
        repository.deleteEmployee(id);
    }
}