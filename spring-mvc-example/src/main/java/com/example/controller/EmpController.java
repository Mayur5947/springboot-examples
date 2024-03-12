package com.example.controller;

import com.example.model.Employee;
import com.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;
import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService service;

    @GetMapping(value = "/list")
    public  String showEmployees(ModelMap model) throws SQLException {
        List<Employee> employees =  service.retriveEmployees();
        model.addAttribute("employees", employees );
        return "employees.jsp";
    }
}
