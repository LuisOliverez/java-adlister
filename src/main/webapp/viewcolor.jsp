<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>
<%--    <%@ include file="/partials/head.jsp"%>--%>
<style>
    body {
        background-color: <%= request.getAttribute("color") %>;
    }
</style>

</head>

<body>

<h2>Your favorite color is <%= request.getAttribute("color") %></h2>

<%--<%@ include file="partials/scripts.jsp"%>--%>

</body>
</html>
