<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Guessing Game</title>
</head>
<body>
<h1>Guessing Game</h1>
<form action="/guess" method="post">
    <label for="guess">Guess a number between 1 and 3:</label>
    <input type="number" id="guess" name="guess" min="1" max="3" required>
    <button type="submit">Submit</button>
</form>
</body>
</html>
