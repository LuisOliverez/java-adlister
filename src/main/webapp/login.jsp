<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile</title>
    <!-- Bootstrap CSS -->

<%@ include file="partials/head.jsp"%>
<%--    <!-- Custom CSS -->--%>
</head>

<body>
<h1>hello</h1>

<%@ include file ="partials/loginBootS.jsp"%>

<%@ include file="partials/scripts.jsp"%>
</body>
</html>
