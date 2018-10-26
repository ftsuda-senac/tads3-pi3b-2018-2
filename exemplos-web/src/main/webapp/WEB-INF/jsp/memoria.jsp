<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h1>Memória</h1>
    <c:if test="${sessionScope.xpto != null}">
        <h2>Último valor selecionado: <c:out value="${sessionScope.xpto}" /></h2>
    </c:if>
    <div>
        <a href="${pageContext.request.contextPath}/memoria?id=1">Selecionar 1</a>
    </div>
    <div>
        <a href="${pageContext.request.contextPath}/memoria?id=2">Selecionar 2</a>
    </div>
    <div>
        <a href="${pageContext.request.contextPath}/memoria?id=3">Selecionar 3</a>
    </div>
    <div>
        <a href="${pageContext.request.contextPath}/memoria?id=4">Selecionar 4</a>
    </div>
</body>
</html>
