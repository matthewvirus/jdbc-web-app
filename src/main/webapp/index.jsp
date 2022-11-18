<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>All Users</title>
    <link rel="stylesheet" href="styles/table.css">
</head>
<body>
<h2>All users</h2>
<p><a href='<c:url value="/create"/>'>Create</a></p>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Age</th>
        <th>Gender</th>
        <th>Options</th>
    </tr>
    <jsp:useBean id="users" scope="request" type="java.util.ArrayList<by.matthewvirus.jdbcwebapp.mysql.business.User>"/>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.surname}</td>
            <td>${user.age}</td>
            <td>${user.gender}</td>
            <td>
                <form method="post" action='<c:url value="/delete"/>' style="display: inline">
                    <input type="hidden" name="id" value="${user.id}">
                    <input type="submit" value="Delete">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>