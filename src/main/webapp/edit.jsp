<jsp:useBean id="user" scope="request" type="by.matthewvirus.jdbcwebapp.mysql.business.User"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit user</title>
</head>
<body>
<h3>New user</h3>
<form method="post">
    <input type="hidden" value="${user.id}" name="id">
    <label>
        Name
        <input type="text" name="name" placeholder="Name" value="${user.name}">
    </label><br>
    <label>
        Surname
        <input type="text" name="surname" placeholder="Surname" value="${user.surname}">
    </label><br>
    <label>
        Age
        <input type="number" name="age" placeholder="Age" value="${user.age}">
    </label><br>
    <p>Gender</p>
    <label>
        <input type="radio" name="gender" value="Male"
        <c:if test="${user.gender == 'Male'}">
                checked
        </c:if>>
        Male
    </label><br>
    <label>
        <input type="radio" name="gender" value="Female"
        <c:if test="${user.gender == 'Female'}">
               checked
        </c:if>>
        Female
    </label><br>
    <input type="submit" value="Edit">
</form>
</body>
</html>