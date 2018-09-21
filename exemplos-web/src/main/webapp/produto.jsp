<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="br.senac.tads.pi3b.exemplos.web.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List<Produto> lista = new ArrayList<>();
            Produto p1 = new Produto();
            p1.setId(1L);
            p1.setNome("Produto 1");
            p1.setPreco(100);
            lista.add(p1);
            Produto p2 = new Produto();
            p2.setId(2L);
            p2.setNome("Produto 2");
            p2.setPreco(110);
            lista.add(p2);
            Produto p3 = new Produto();
            p3.setId(3L);
            p3.setNome("Produto 3");
            p3.setPreco(90);
            lista.add(p3);
            request.setAttribute("resultado", lista);
            
        %>
        <h1>Tabela de produtos</h1>
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
