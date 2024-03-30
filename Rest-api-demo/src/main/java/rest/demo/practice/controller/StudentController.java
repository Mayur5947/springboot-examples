package rest.demo.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rest.demo.practice.model.Student;
import rest.demo.practice.service.StudentService;

import java.sql.SQLException;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/getAll")
    public List<Student> check() throws SQLException {
        return studentService.getAllStudent();
    }

    @GetMapping(value = "/get/{id}")
    public Student getStudent(@PathVariable int id) throws SQLException {
        return studentService.getStudent(id);
    }

    @PostMapping(value = "/add")
    public String addStudent(@RequestBody Student student) throws SQLException {
        return studentService.addStudent(student);
    }

    @PutMapping(value = "/update")
    public String updateStudent(@RequestBody Student student) throws SQLException {
        return studentService.updateStudent(student);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteStudent(@PathVariable int id) throws SQLException {
        return studentService.deleteStudent(id);
    }

}
