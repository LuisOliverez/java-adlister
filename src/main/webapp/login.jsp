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
</head>
<body>
<h2>Login</h2>
<form action="login.jsp" method="POST">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required><br><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>

    <input type="submit" value="Login">
</form>
</body>
</html>
