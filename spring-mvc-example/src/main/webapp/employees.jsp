<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
</head>
<body>
success page
<table border="2px solid" align="center">
        <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Phone</th>
                <th>Email</th>
                <th>Password</th>
        </tr>
        <c:forEach var="employee" items="${employees}">
                <tr>
                        <td>${employee.getId()}</td>
                        <td>${employee.getName() }</td>
                        <td>${employee.getPhone() }</td>
                        <td>${employee.getEmail() }</td>
                        <td>${employee.getPassword() }</td>

                </tr>
        </c:forEach>
</table>
</body>
</html>