<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/30/2023
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<h2>Simple Calculator</h2>
<form action="<c:url value="/calculate"/>" method="post">
  <fieldset>Calculator
      <h4>First operand</h4>
      <input type="number" name="first_operator">
      <h4>Operator: </h4>
  <select name="operator" class="form-select" aria-label="Default select example">
    <option selected>Choose Calculation</option>
    <option value="+">Addition</option>
    <option value="-">Subtraction</option>
    <option value="/">Division</option>
    <option value="*">Multiplication</option>
  </select>
      <h4>Second operand</h4>
      <input type="number" name="second_operator">
  <button type="submit">Calculate</button>
  </fieldset>
</form>
</body>
</html>
