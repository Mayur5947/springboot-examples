package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Employee;
import com.example.service.ConnectionService;
import org.springframework.stereotype.Repository;

@Repository
public class EmpRepository {


    Connection connection   = ConnectionService.getConnection();

    public List<Employee> retriveEmployees() throws SQLException {
        PreparedStatement statement =connection.prepareStatement("select * from employee ");
        List<Employee> employees = new ArrayList<Employee>();
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()) {
            Employee employee = new Employee();
            System.out.println("in repo");
            employee.setId(resultSet.getInt(1));
            employee.setEmail(resultSet.getString(2));
            employee.setName(resultSet.getString(3));
            employee.setPassword(resultSet.getString(4));
            employee.setPhone(resultSet.getLong(5));
            employees.add(employee);
        }
        return employees;
    }

}
