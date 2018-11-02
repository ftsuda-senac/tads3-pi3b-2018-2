<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${sessionScope.usuario != null}">
    <div style="background-color: cadetblue">
        <h2>Bem vindo <c:out value="${sessionScope.usuario.nomeCompleto}" /></h2>
        <p><c:out value="${sessionScope.usuario.hashSenha}" /></p>
        <a href="${pageContext.request.contextPath}/logout">Sair</a>
    </div>
</c:if>
