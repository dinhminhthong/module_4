<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1> Currency Conversion</h1>
<form action="conversion" method="post">
  <table>
    <tr>
      <th> Input USD</th>
      <th><input name="usd" placeholder="Enter Usd"></th>
    </tr>
    <tr>
      <th></th>
      <th><button type="submit">Conversion</button></th>
    </tr>
    <tr>
      <td>Kết Quả</td>
      <td>${vnd}</td>
    </tr>
  </table>
</form>

</body>
</html>