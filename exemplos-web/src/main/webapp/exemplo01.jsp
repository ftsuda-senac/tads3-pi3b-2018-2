<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exemplo usando Scriptlet</h1>
        <%
            for (int i = 0; i < 100; i++) {
        %>
        <h2>Hello World <%= i %></h2>
        <%
            }
        %>
    </body>
</html>
