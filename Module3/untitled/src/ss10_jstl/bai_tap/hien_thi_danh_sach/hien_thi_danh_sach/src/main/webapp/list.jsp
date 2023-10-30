<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/30/2023
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<html>
<head>
    <title>Title</title>
    <style>
        img {
            height: 190px;
            width: 220px;
        }
    </style>
</head>
<body>
<table class="table table-stripped">
    <caption align="top"><h2>Danh Sách Khách Hàng</h2></caption>
    <thead>
    <tr>
        <th>Id</th>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa Chỉ</th>
        <th>Ảnh</th>
    </tr>
    </thead>
    <c:forEach items="${customerList}" var="customers" varStatus="status">

        <tr>
            <td>${status.count}</td>
            <td>${customers.name}</td>
            <td>${customers.dob}</td>
            <td>${customers.address}</td>
            <td><img src="${customers.img}"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
