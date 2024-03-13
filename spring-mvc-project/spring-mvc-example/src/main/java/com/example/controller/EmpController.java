package com.example.controller;

import com.example.model.Employee;
import com.example.service.EmpService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService service;

    @GetMapping(value = "/list")
    public String showEmployees(ModelMap model) throws SQLException {
        List<Employee> employees = service.retriveEmployees();
        model.addAttribute("employees", employees);
        return "employees.jsp";
    }

    @GetMapping(value = "/add")
    public String addEmployeePage() {
        return "redirect:add-employee.jsp";
    }

    @PostMapping(value = "/add")
    public String addEmployee(@ModelAttribute Employee employee) throws SQLException {
        service.addEmployee(employee);
        return "home.jsp";
    }


    @PostMapping(value = "/update")
    public String updateEmployee(@ModelAttribute Employee employee) throws SQLException {
        service.updateEmployee(employee);
        return "redirect:home.jsp";
    }


    @RequestMapping(value = "/update", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView updateEmployeePage(@RequestParam("id") int id, ModelMap model) throws SQLException {
        Employee employee = service.retriveEmployee(id);
        ModelAndView view = new ModelAndView();
        view.setViewName("update-employees.jsp");
        view.addObject("employee", employee);
        model.addAttribute("command", employee);
        return view;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView deleteEmployeePage(@RequestParam("id") int id, ModelMap model) throws SQLException {
        ModelAndView view = new ModelAndView();
        service.deleteEmployee(id);
        view.setViewName("home.jsp");
        return view;
    }


}
