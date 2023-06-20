<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>

    <title>Index</title>

</head>

<body>
<%--NAVBAR--%>
<jsp:include page="partials/navbar.jsp" />

<table class="table">
    <thead>
    <tr>
        <th scope="col">Title</th>
        <th scope="col">Description</th>
    </tr>
    </thead>
    <tbody>

    <%--LOOP THROUGH ADS--%>
    <c:forEach var="ad" items="${ads}">
        <tr>
            <th scope="row">${ad.title}</th>
            <th>${ad.description}</th>
        </tr>
    </c:forEach>

    </tbody>
</table>

</body>
</html>