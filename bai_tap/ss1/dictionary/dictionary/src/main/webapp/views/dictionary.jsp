<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/27/2023
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cambridge Dictionary</title>
</head>
<body>
<h2>Cambridge Dictionary</h2>
<form action="/cambridge">
    <input type="text" name="english" placeholder="search" value="${english}">
    <input type="submit" value="search">
</form>
<h2>${result}</h2>
</body>
</html>