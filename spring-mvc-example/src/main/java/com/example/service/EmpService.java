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
}