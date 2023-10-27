<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Calculator</title>
</head>
<body>
<h1><%= "Products Calculator" %>
</h1>
<br/>
<form action="/products-calculator" method="post">
    <input name="product_Description" placeholder="Mô tả sản phẩm"><br>
    <input name="product_Price" placeholder="Giá sản phẩm"><br>
    <input name="discount_Percent" placeholder="Tỷ lệ chiết khấu(phần trăm)">
    <button type="submit">Calc</button></form>

</body>
</html>