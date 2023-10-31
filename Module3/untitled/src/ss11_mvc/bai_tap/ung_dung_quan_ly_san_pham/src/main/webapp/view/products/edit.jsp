<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/31/2023
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/products?action=edit" method="post">
<input value="${id}" name="idEdit">
<input value="${name}" name="nameEdit">
<input value="${price}" name="priceEdit">
<input value="${description}" name="descriptionEdit">
<input value="${manufacture}" name="manufactureEdit">
    <button type="submit">Gửi</button>
</form>
</body>
</html>
