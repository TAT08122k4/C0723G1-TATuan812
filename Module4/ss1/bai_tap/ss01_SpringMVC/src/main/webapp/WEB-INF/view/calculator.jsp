<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/14/2023
  Time: 10:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculator" method="post">
    <input name="firstNumber">
    <select name="convert">
        <option value=1>VND => Dolar</option>
        <option value=2>Dolar => VND</option>
        <option value=3>¥ => VND</option>
        <option value=4>VND => ¥</option>
    </select>
    <button>Calculator</button>
</form>
<h2>Kết quả chuyển đổi là : ${result}</h2>
</body>
</html>
