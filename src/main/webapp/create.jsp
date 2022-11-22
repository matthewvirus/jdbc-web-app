<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Create user</title>
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
    <p>Gender</p>
    <label>
        <input type="radio" name="gender" value="Male">
        Male
    </label><br>
    <label>
        <input type="radio" name="gender" value="Female">
        Female
    </label><br>
    <input type="submit" value="Create">
</form>
</body>
</html>