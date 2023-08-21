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
<h1>Cập nhật</h1>
<form action="/todoController/update" method="post">
    <input type="text" name="id" readonly value="${todo_edit.id}">
    <br>
    <input type="text" name="title"  value="${todo_edit.title}">
    <br>
    <input type="text" name="content"  value="${todo_edit.content}">
    <br>
    <select name="status" value="${todo_edit.status}">
        <option value="true">Đã hoan thành</option>
        <option value="false">Chưa hoan thành</option>
    </select>
    <br>
    <input type="submit" value="Add">
</form>
</body>
</html>
