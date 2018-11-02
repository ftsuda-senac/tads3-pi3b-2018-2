<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home</h1>
        <c:import url="cabecalho.jsp" />
        <c:if test="${sessionScope.usuario.verificarPapel('PEAO')}">
            <div>
                <a href="${pageContext.request.contextPath}/protegido/peao">Entrar em /protegido/peao</a>
            </div>
        </c:if>
        <c:if test="${sessionScope.usuario.verificarPapel('FODON')}">
            <div>
                <a href="${pageContext.request.contextPath}/protegido/fodon">Entrar em /protegido/fodon</a>
            </div>
        </c:if>
        <c:if test="${sessionScope.usuario.verificarPapel('GOD')}">
            <div>
                <a href="${pageContext.request.contextPath}/protegido/god">Entrar em /protegido/god</a>
            </div>
        </c:if>
    </body>
</html>
