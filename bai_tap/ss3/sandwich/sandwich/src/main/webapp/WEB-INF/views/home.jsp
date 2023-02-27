<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/27/2023
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
  <link rel="stylesheet" href="/css/bootstrap.min.css">
  <script src="/js/bootstrap.min.js"></script>
</head>
<body>
<h1> Sandwich Condiments</h1>
<form action="save" method="post">
  <span><input type="checkbox" value="lettuce" name="condiment">Lettuce</span>
  <span><input type="checkbox" value=tomato" name="condiment" >Tomato</span>
  <span><input type="checkbox" value="mustard" name="condiment">Mustard</span>
  <span><input type="checkbox" value="sprouts" name="condiment">Sprouts</span><br>
  <button type="submit">Save</button>
</form>
<table class="table table-striped">
  <tr>
    <th>Sandwich Condiments</th>
  </tr>
  <c:forEach var="condiment" items="${condiment}">
    <tr>
      <th>${condiment}</th>
    </tr>
  </c:forEach>
</table>

</body>
</html>
