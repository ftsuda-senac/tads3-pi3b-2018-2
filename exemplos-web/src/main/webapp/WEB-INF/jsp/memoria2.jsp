<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h1>Memória 2</h1>
    <c:if test="${sessionScope.lista != null && !sessionScope.lista.isEmpty()}">
        <h2>IDs selecionados</h2>
        <div>
            <c:forEach var="idSel" items="${sessionScope.lista}">
                <span><c:out value="${idSel}" /></span>
            </c:forEach>
        </div>
    </c:if>
    <div>
        <a href="${pageContext.request.contextPath}/memoria2?id=1">Selecionar 1</a>
    </div>
    <div>
        <a href="${pageContext.request.contextPath}/memoria2?id=2">Selecionar 2</a>
    </div>
    <div>
        <a href="${pageContext.request.contextPath}/memoria2?id=3">Selecionar 3</a>
    </div>
    <div>
        <a href="${pageContext.request.contextPath}/memoria2?id=4">Selecionar 4</a>
    </div>
</body>
</html>
