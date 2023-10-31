<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/31/2023
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List-Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<a href="/products?action=add">Add</a>
<a href="/products?action=remove">Remove</a>
<a href="/products?action=edit">Edit</a>
<a href="/products?action=getDetail">GetDetail</a>

<input type="text" name="id1">
<table class="table-striped">
    <thead>
    <tr>
        <th>Id</th>
        <th>Tên Sản Phẩm</th>
        <th>Giá Tiền</th>
        <th>Tình Trạng</th>
        <th>Nhà Sản Xuất</th>
    </tr>
    </thead>
    <c:forEach items="${productList}" var="products">
        <tr>
            <th>${products.id}</th>
            <th>${products.name}</th>
            <th>${products.price}</th>
            <th>${products.description}</th>
            <th>${products.manufacturer}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
