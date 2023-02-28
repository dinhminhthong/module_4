<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/28/2023
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>
<h1>HÒM THƯ ĐIỆN TỬ</h1>

<form:form modelAttribute="setting" action="/newUpdate" method="post">
<table class=" table table-row-cell">
    Language:
    <form:hidden path ="id" items="${id}" ></form:hidden><br>
    <form:select path="languages" items="${languages}" ></form:select><br>
    Page Size:
    <form:select path="pageSize" items="${pageSize}" ></form:select><br>
    Spams Filter:
    <form:checkbox path="spamsFillter"></form:checkbox><br>
    Signature:
    <form:textarea path="signature"></form:textarea><br>
    <form:button> Update</form:button>
</table>
</form:form>

</body>
</html>
