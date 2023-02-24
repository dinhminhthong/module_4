<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/24/2023
  Time: 6:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<form action="/search">
    <label>Search</label>
    <input type="text" name="word">
    <input type="submit" value="Submit">
</form>
<div>${search}</div>
</html>
