<%--
  Created by IntelliJ IDEA.
  User: hung1
  Date: 8/21/2023
  Time: 8:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Thêm mới</h1>
<form action="/todoController/handle-add" method="post">
    <input type="text" name="title">
    <br>
    <input type="text" name="content">
    <br>
    <input type="submit" value="Add">
</form>
</body>
</html>
