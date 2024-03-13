<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
update page
<div>
     <form:form action="update" method="post"  commandName="employee">
        <form:hidden path="id"/>
        <form:label path="email">email</form:label>
        <form:input path="email" type="text"/>
        <form:label path="name">name</form:label>
        <form:input path="name" type="text"/>
        <form:label path="password">password</form:label>
        <form:input path="password" type="text"/>
        <form:label path="phone">phone</form:label>
        <form:input path="phone" type="number"/>
        <button type="submit">Submit</button>
    </form:form>
</div>
</body>
</html>