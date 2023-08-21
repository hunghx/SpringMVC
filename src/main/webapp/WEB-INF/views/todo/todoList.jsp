<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h1>Danh sách công việc</h1>
<a href="/todoController/add">Add New Todo</a>
<table>
  <tr>
    <th>STT</th>
    <th>Title</th>
    <th>Content</th>
    <th>Status</th>
    <th colspan="2">Action</th>
  </tr>
  <c:forEach items="${list}" var="todo" varStatus="loop">
    <tr>
      <td>${loop.count}</td>
      <td>${todo.title}</td>
      <td>${todo.content}</td>
      <td>${todo.status?"Đã hoan thành":"Chưa hoàn thành"}</td>
      <td><a href="/todoController/edit/${todo.id}">Edit</a></td>
      <td><a onclick="return confirm('Bạn có chắc chắn muốn xóa không')" href="/todoController/delete?id=${todo.id}">Delete</a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
