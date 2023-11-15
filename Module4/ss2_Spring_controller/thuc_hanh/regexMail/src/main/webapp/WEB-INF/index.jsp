<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Email</title>
</head>
<body>
<h1><%="Email Validate" %>
</h1>
<h3 style="color: red">${mess}</h3>
<form action="validate" method="post">
<input type="text" name="email"><br>
    <input type="submit" value="Validate">
</form>
<br/>
</body>
</html>