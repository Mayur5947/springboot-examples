package rest.demo.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.demo.practice.model.Student;
import rest.demo.practice.repository.StudentRepository;

import java.rmi.StubNotFoundException;
import java.sql.SQLException;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudent() throws SQLException {
        return studentRepository.getAllStudent();
    }

    public String addStudent(Student student) throws SQLException {
        String msg = studentRepository.addStudent(student);
        return msg;
    }

    public Student getStudent(int id) throws SQLException {
        return studentRepository.retriveStudent(id);
    }

    public String updateStudent(Student student) throws SQLException {
        return studentRepository.updateStudent(student);
    }

    public String deleteStudent(int id) throws SQLException {
        return studentRepository.deleteStudent(id);
    }
}
