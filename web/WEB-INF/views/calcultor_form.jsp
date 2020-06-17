<%--
  Created by IntelliJ IDEA.
  User: VanHuan
  Date: 6/17/2020
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get">

    <input type="number" name="firstOperator">
    <input type="number" name="secondOperator"><br>

    <button type="submit" formaction="/add">addition(+)</button>
    <button type="submit" formaction="/sub">subtraction(-)</button>
    <button type="submit" formaction="/mul">multiple(*)</button>
    <button type="submit" formaction="/div">divide(/)</button>

</form>
</body>
</html>
