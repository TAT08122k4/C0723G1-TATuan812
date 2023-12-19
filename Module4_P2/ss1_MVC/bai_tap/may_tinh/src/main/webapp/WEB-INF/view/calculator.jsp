<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/18/2023
  Time: 9:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<form method="post" action="/conversion" style="border: 1px solid black">
<fieldset>
    <legend>Currency conversion :</legend>
<input name="firstNum" required>
    <select name="denominationOfMoney">
        <option value="1">
            $ -> VNĐ
        </option>
        <option value="2">
          VND -> $
        </option>
        <option value="3">
            ¥ -> VNĐ
        </option>
        <option value="4">
            VND -> ¥
        </option>
    </select>
 <button>Conversion</button>
</fieldset>
    <p>Kết Quả Sau Khi Chuyển Đổi Là : ${result}</p>
</form>
</body>
</html>
