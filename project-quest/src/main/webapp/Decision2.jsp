<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Марк
  Date: 10.10.2022
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Ты отклонил вызов!</h1>
<h3>Поражение!</h3>
<form action="<c:url value="/start"/>">
    <button type="submit">Начать заново!</button>
</form>
</body>
</html>
