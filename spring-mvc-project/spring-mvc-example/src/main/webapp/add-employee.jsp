<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
</head>
<body style="background-color:cornsilk">
<div align="center">
    <center>
        <fieldset>
            <form style="align-content: center" action="add" method="post">
                <br>Id<input type="text" name="id"><br>
                <br>name<input type="text" name="name"><br>
                <br>phone<input type="text" name="phone"><br>
                <br>email<input type="text" name="email"><br>
                <br>password<input type="text" name="password">
                <button>submit</button>
            </form>
        </fieldset>
    </center>
</div>
</body>
</html>