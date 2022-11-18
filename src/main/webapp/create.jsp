<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>New user</h3>
<form method="post">
    <label>
        Name
        <input type="text" name="name" placeholder="Name">
    </label><br>
    <label>
        Surname
        <input type="text" name="surname" placeholder="Surname">
    </label><br>
    <label>
        Age
        <input type="number" name="age" placeholder="Age">
    </label><br>
    <label>
        Gender
        <input type="text" name="gender" placeholder="Gender">
    </label><br>
    <input type="submit" value="Create">
</form>
</body>
</html>
