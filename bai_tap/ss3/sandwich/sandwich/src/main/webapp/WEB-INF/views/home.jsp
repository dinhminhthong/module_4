<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/27/2023
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
<table>
  <tr>
    <th>Sandwich Condiments</th>
  </tr>
  <c:forEach var="condiment" items="${condiments}">
    <tr>
      <th>${condiment}</th>
    </tr>
  </c:forEach>
</table>

</body>
</html>
