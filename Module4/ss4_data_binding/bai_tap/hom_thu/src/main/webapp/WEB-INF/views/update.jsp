<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/16/2023
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
            integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
            integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <title>Title</title>
</head>
<body>
<h2>Chỉnh Sửa Cấu Hình</h2>

<form:form method="post" modelAttribute="mailBox" action="updateMailBox">
    <table class="table-view">
        <tr class="table-active">
            <td>Languages:</td>
            <td>
                <form:select path="languages" >
                    <form:options items="${languagesList}" />
                </form:select>
            </td
        </tr>
        <tr class="table-active">
            <td>Page Size:</td>
            <td>
                <form:select path="pageSize" itemValue="${mailBox.pageSize}">
                    <form:options items="${pageSizeList}"/>
                </form:select>
            </td>
            emails per page
        </tr>
        <tr>
            <td>Spams filter:</td>
            <td><form:checkbox path="spamsFilter"></form:checkbox>Emails Spams filter</td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td><form:textarea path="signature"></form:textarea></td>
        </tr>
        <tr>
            <td>
                <form:button>Submit</form:button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
