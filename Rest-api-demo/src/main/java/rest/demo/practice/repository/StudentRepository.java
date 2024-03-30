package rest.demo.practice.repository;

import org.springframework.stereotype.Repository;
import rest.demo.practice.model.Student;
import rest.demo.practice.service.ConnectionService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    Connection connection = ConnectionService.getConnection();

    public StudentRepository() throws SQLException {
    }

    public List<Student> getAllStudent() throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from student ");
        List<Student> students = new ArrayList<Student>();
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Student student = new Student();
            System.out.println("in repo");
            student.setId(resultSet.getInt(1));
            student.setAddress(resultSet.getString(3));
            student.setName(resultSet.getString(2));
            student.setMarks(resultSet.getLong(4));
            students.add(student);
        }
        return students;
    }

    public String addStudent(Student student) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into student values (?,?,?,?)");
        statement.setInt(1, student.getId());
        statement.setString(2, student.getName());
        statement.setString(3, student.getAddress());
        statement.setLong(4, student.getMarks());
        statement.executeUpdate();
        return "Added Succesfully";
    }

    public Student retriveStudent(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from student where id = ?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        Student student = new Student();
        while (resultSet.next()) {
            System.out.println("in repo");
            student.setId(resultSet.getInt(1));
            student.setAddress(resultSet.getString(3));
            student.setName(resultSet.getString(2));
            student.setMarks(resultSet.getLong(4));
        }
        return student;
    }

    public String updateStudent(Student student) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("update student set name = ? , marks = ? , address = ?  where id = ? ");
        statement.setInt(4, student.getId());
        statement.setString(1, student.getName());
        statement.setString(3, student.getAddress());
        statement.setLong(2, student.getMarks());
        statement.executeUpdate();
        return "Updated Sucesfully";
    }

    public String deleteStudent(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("delete from student where id = ?");
        statement.setInt(1, id);
        statement.executeUpdate();
        return "Deleted";
    }

}
