<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/15/2023
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="/create" method="post">
    <input type="checkbox" name="condiment" value="Lettuce ">Lettuce
    <input type="checkbox" name="condiment" value="Tomato"> Tomato
    <input type="checkbox" name="condiment" value="Mustard"> Mustard
    <input type="checkbox" name="condiment" value="Sprouts"> Sprouts
    <hr>
    <input type="submit" value="save">
</form>
</body>
</html>
