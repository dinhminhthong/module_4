<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/24/2023
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring</title>
</head>
<h1>Currency conversion</h1>
<form action="/convert" method="get">
    <table class="table table-striped">
    <input type="text" name="USD" value="${USD}">
    <button type="submit" value="Result">Result</button>
    </table>
</form>
<h1>Result = ${VND}</h1>
</html>
