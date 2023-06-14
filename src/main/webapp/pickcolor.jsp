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

  <label for="color-picker" class="form-label">Enter a color:</label>
  <input type="text" id="color-picker" name="pickcolor" class="form-control">


<!-- Submit Button -->
<button type="submit" name="submit">Submit</button>

<%@ include file="partials/scripts.jsp"%>
</body>
</html>
