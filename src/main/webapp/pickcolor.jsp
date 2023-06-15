<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Page Title</title>

    <%@ include file="/partials/head.jsp"%>
</head>
<body>

    <form action="/pickcolor" method="POST">
          <label for="color" class="form-label">
              What is your favorite color?
          </label>
            <input type="text" id="color" name="color" class="form-control">

<!-- Submit Button -->
<button type="submit" name="submit">Submit</button>
    </form>

<%@ include file="partials/scripts.jsp"%>
</body>
</html>
