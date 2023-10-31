<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/31/2023
  Time: 1:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/products?action=add" method="post">
    <input type="number" placeholder="Nhập Id" name="id">
    <input placeholder="Nhập tên sản phẩm" name="name">
    <input placeholder="Nhập Giá Tiền" name="price">
    <input placeholder="Nhập Tình trạng sản phẩm" name="description">
    <input placeholder="Nhập nhà sản xuất" name="manufacture">
    <button type="submit">Gửi</button>
</form>
</body>
</html>
