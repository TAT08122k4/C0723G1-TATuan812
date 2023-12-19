<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/18/2023
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh Sách Khách Hàng</title>
</head>
<body>
<table>
  <caption>Customer List</caption>
  <thead>
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Email</th>
    <th>Address</th>
  </tr>
  </thead>
  <tbody>
<c:forEach var="customer" items="${customers}">
<tr>
  <td>
    <c:out value="${customer.id}"/>
  </td>
  <td>
<%--    <a href="info.jsp?id=${customer.id}">${customer.name}</a>--%>
    <c:out value="${customer.name}"/>
  </td>
  <td>
    <c:out value="${customer.email}"/>
  </td>
  <td>
    <c:out value="${customer.address}"/>
  </td>
</tr>
</c:forEach>
  </tbody>
</table>
</body>
</html>
