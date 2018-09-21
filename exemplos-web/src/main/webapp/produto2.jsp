<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabela de produtos exemplo Servlet + JSP</h1>
        <p>Nome: <c:out value="${nome}" /></p>
        <p>Idade: <c:out value="${idade}" /></p>
        <table>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Preço</th>
            </tr>
            <c:forEach items="${resultado}" var="p">
                <tr>
                    <td><c:out value="${p.getId()}" /></td>
                    <td><c:out value="${p.getNome()}" /></td>
                    <td><c:out value="${p.getPreco()}" /></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
