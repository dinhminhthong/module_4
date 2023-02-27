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
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/bootstrap.min.js"></script>
</head>
<form action="/search">
    <table class="table table-striped">
    <label>Search</label>
    <input type="text" name="word">
    <input type="submit" value="Submit">
    </table>
</form>
<div>${search}</div>
</html>
