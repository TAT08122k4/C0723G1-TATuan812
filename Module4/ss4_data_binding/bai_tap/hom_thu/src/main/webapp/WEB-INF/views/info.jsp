<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/16/2023
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <title>Title</title>
</head>
<body>
<h3>Thông tin cấu hình</h3>
<table class="table-view">
    <tr class="table-active">
        <td>Language:</td>
        <td>${mailBox.languages}</td>
    </tr>
    <tr class="table-active">
        <td>Page Size:</td>
        <td>${mailBox.pageSize}</td>
    </tr>
    <tr class="table-active">

        <td>Spams Filter:</td>
        <c:choose>
            <c:when test="${mailBox.spamsFilter == true}">
           <td>Yes</td>
            </c:when>
            <c:otherwise>
               <td>No</td>
            </c:otherwise>
        </c:choose>
    </tr>
    <tr class="table-active">
        <td>Signature:</td>
        <td>${mailBox.signature}</td>
    </tr>
    <tr>
     <td><a href="/mailbox/showFormUpdate" class="btn btn-primary active" aria-current="page">Update</a></td>

    </tr>

</table>
</body>
</html>
