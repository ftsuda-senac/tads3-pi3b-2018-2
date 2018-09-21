<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exemplo usando JSTL</h1>
        <c:forEach begin="0" end="99" varStatus="stat">
            <h2>Hello World <c:out value="${stat.index}" /></h2>
        </c:forEach>
    </body>
</html>
