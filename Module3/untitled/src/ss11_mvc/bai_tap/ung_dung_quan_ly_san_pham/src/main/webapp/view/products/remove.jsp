<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/31/2023
  Time: 2:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/products?action=remove" method="post">
    <input placeholder="Nhập Id Bạn Muốn Xoá" name="id" type="number">
    <button type="submit">Gửi</button>
</form>
</body>
</html>
