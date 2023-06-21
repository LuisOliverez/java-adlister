<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta >
<%@ include file="/partials/bsHeader.jsp"%>
    <title>

    </title>

</head>
<body>

<%@ include file="/partials/navbar.jsp"%>
<a href="/profile?logout=true">Logout</a>

<div class="container">
    <h1>Welcome, <%= session.getAttribute("user") %></h1>

</div>


<%@ include file="/partials/bsFooter.jsp"%>
</body>
</html>
