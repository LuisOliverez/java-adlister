<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%@ include file="partials/bsHeader.jsp"%>

    <title>Index</title>

</head>

<body>
<%--NAVBAR--%>
<%@include file="partials/navbar.jsp"%>

<table class="table table-striped table-dark">
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

<%@ include file="partials/bsFooter.jsp"%>
</body>
</html>