<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/14/2023
  Time: 11:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Từ Điển Tiếng Anh</h3>
<form method="post" action="/dictionary" >
    <input name="englishWord" placeholder="Enter the word">
    <button>Translate</button>
</form>
<input value="${wordTranslate}">
</body>
</html>
