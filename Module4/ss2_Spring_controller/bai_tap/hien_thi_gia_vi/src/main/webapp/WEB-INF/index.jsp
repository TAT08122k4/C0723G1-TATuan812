<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sandwich-Condiments</title>
</head>
<body>
<a href="create">Chuyển sang trang công thức</a>
<h2>List Condiment of SandWich</h2>
<p>Công thức SandWich là <c:forEach items="${condiments}" var="condiment">${condiment}  </c:forEach></p>
</body>
</html>