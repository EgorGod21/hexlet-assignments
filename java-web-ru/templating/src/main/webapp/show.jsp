<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- BEGIN -->
<html>
<head>
    <meta charset="UTF-8">
    <title>Company</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
          crossorigin="anonymous">
</head>
<body>
<table>
    <colgroup>
        <col span="2" style="background:Khaki"><!-- С помощью этой конструкции задаем цвет фона для первых двух столбцов таблицы-->
        <col style="background-color:#e9e0ff"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
    </colgroup>

    <tr><td>id: </td><td>${users.get("id")}</td></tr>
    <tr><td>firstName: </td><td>${users.get("firstName")}</td></tr>
    <tr><td>lastName: </td><td>${users.get("lastName")}</td></tr>
    <tr><td>email: </td><td>${users.get("email")}</td></tr>

</table>
</body>
</html>
