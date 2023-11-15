<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="calculator" method="post">
    <input name="firstNumber">
    <input name="secondNumber">
    <br>
    <button name="cal" value="+">Addition(+)</button>
    <button name="cal" value="-">Subtraction(-)</button>
    <button name="cal" value="*">Multiplication(x)</button>
    <button name="cal" value="/">Division(/)</button>
</form>
<h3>Result: ${result}</h3>
</body>
</html>