<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página protegida</title>
    </head>
    <body>
        <h1><c:out value="${titulo}" /></h1>
        <c:import url="cabecalho.jsp" />
        <h2><c:out value="${msg}" /></h2>
    </body>
</html>
