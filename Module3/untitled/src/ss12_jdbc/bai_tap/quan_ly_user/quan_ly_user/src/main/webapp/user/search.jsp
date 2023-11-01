<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/1/2023
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>User Management</h1>
<h2>
  <a href="/users">List All Users</a>
</h2>
<table border="1" cellpadding="5">
  <caption><h2>Search By Name</h2></caption>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Country</th>
  </tr>
  <c:forEach var="user" items="${ListSearch}">
    <tr>
      <td><c:out value="${user.id}"/></td>
      <td><c:out value="${user.name}"/></td>
      <td><c:out value="${user.email}"/></td>
      <td><c:out value="${user.country}"/></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
