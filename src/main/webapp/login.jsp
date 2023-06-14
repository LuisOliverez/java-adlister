<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%  //TEMP INFO FOR TESTING
    String validUsername = "admin";
    String validPassword = "password";

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    //AUTHENTICATION
    boolean isAuthenticated = username != null && username.equals(validUsername) && password != null && password.equals(validPassword);

    if (isAuthenticated) {
        response.sendRedirect("profile.jsp");
    }
%>

<html>
<head>

    <title>Login</title>
<%@include file="partials/scripts/scripts.jsp"%>
</head>


<body>

<%@include file = "partials/loginBootS.jsp" %>


</body>
</html>
