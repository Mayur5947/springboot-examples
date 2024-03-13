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


    public void addEmployee(Employee employee) throws SQLException {
        PreparedStatement  statement = connection.prepareStatement("insert into employee values (?,?,?,?,?)");
        statement.setInt(1,employee.getId());
        statement.setString(2,employee.getEmail());
        statement.setString(3,employee.getName());
        statement.setString(4,employee.getPassword());
        statement.setLong(5,employee.getPhone());
        statement.executeUpdate();
    }

    public Employee retriveEmployee(int id) throws SQLException {
        PreparedStatement statement =connection.prepareStatement("select * from employee where id = ?");
        statement.setInt(1,id);
        ResultSet resultSet = statement.executeQuery();
        Employee employee = new Employee();
        while(resultSet.next()) {
            System.out.println("in repo");
            employee.setId(resultSet.getInt(1));
            employee.setEmail(resultSet.getString(2));
            employee.setName(resultSet.getString(3));
            employee.setPassword(resultSet.getString(4));
            employee.setPhone(resultSet.getLong(5));
        }
        return employee;
    }

    public void updateEmployee(Employee employee) throws SQLException {
        PreparedStatement  statement = connection.prepareStatement("update employee set email = ? , name = ? , password = ? , phone =? where id = ? ");
        statement.setInt(5,employee.getId());
        statement.setString(1,employee.getEmail());
        statement.setString(2,employee.getName());
        statement.setString(3,employee.getPassword());
        statement.setLong(4,employee.getPhone());
        statement.executeUpdate();
    }

    public void deleteEmployee(int id) throws SQLException {
        PreparedStatement statement =connection.prepareStatement("delete from employee where id = ?");
        statement.setInt(1,id);
        statement.executeUpdate();
    }
}
