<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<div>
    <table border="2px solid" align="center">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Password</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.getId()}</td>
                <td>${employee.getName() }</td>
                <td>${employee.getPhone() }</td>
                <td>${employee.getEmail() }</td>
                <td>${employee.getPassword() }</td>
                <td><a type="button" href="update?id=${employee.getId()}">Update Employee</a></td>
                <td><a type="button" href="delete?id=${employee.getId()}">Delete Employee</a></td>
            </tr>
        </c:forEach>

    </table>
</div>
<div  align="center">
    <a href="home.jsp" style="background-color: cyan">HOME</a>
</div>
</body>
</html>