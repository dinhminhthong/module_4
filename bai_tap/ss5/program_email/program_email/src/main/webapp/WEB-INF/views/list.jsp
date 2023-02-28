<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/28/2023
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Settings</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>
<table class="table table-row-cell">
  <tr>
    <th>ID</th>
    <th>LANGUAGES</th>
    <th>PAGESIZE</th>
    <th>SPAMSFILLTER</th>
    <th>SIGNATURE</th>
    <th>EDIT</th>
  </tr>
  <c:forEach var="list" items="${listSetting}">
    <tr>
      <td>${list.id}</td>
      <td>${list.languages}</td>
      <td>${list.pageSize}</td>
      <td>${list.spamsFillter}</td>
      <td>${list.signature}</td>
      <td><a href="/update-form/${list.id}">UPDATE</a></td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
