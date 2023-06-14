<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Page Title</title>

    <%@ include file="head.jsp"%>
    <style>
        body {
            background: linear-gradient(to bottom, #25311E, #0E1F0C);
            background-size: 100vw 100vh;
            color: #FFF;
        }

        .form-container {
            background: linear-gradient(to top, #004225, #00311F);
            margin-top: 20px;
            padding: 20px;
            border-radius: 10px;
        }

        label {
            color: #8AFFB3;
            font-weight: bold;
        }

        button[type="submit"] {
            background: linear-gradient(to bottom, #006C38, #004F26);
            color: #FFF;
            border: none;
            padding: 8px 20px;
            border-radius: 5px;
            font-weight: bold;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="form-container">
                <h2>Build your own pizza!</h2>

                <form action="pizza-order" method="post">

                    <!-- Crust Type -->
                    <div class="mb-3">
                        <label for="crust-type" class="form-label">Crust:</label>
                        <select id="crust-type" name="crustType" class="form-select">
                            <option value="hand-tossed">Hand Tossed</option>
                            <option value="crispy-thin">Crispy Thin</option>
                        </select>
                    </div>

                    <!-- Sauce Type -->
                    <div class="mb-3">
                        <label for="sauce-type" class="form-label">Sauce:</label>
                        <select id="sauce-type" name="sauceType" class="form-select">
                            <option value="tomato">Tomato</option>
                            <option value="marinara">Marinara</option>
                            <option value="bbq">BBQ</option>
                            <option value="alfredo">Alfredo</option>
                        </select>
                    </div>

                    <!-- Size Type -->
                    <div class="mb-3">
                        <label for="size-type" class="form-label">Size:</label>
                        <select id="size-type" name="sizeType" class="form-select">
                            <option value="small">Small (10")</option>
                            <option value="medium">Medium (12")</option>
                            <option value="large">Large (14")</option>
                        </select>
                    </div>

                    <!-- Toppings -->
                    <div class="mb-3">
                        <p class="form-label">Toppings:</p>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" name="toppings" value="beef"
                                   id="topping-beef">
                            <label class="form-check-label" for="topping-beef">Beef</label>

                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" name="toppings" value="ham"
                                   id="topping-ham">
                            <label class="form-check-label" for="topping-ham">Ham</label>
                        </div>
                        <div class="form-check">
<input class="form-check-input" type="checkbox" name="toppings" value="philly-cheese"
       id="topping-philly-cheese">
<label class="form-check-label" for="topping-philly-cheese">Philly Cheese</label>
</div>
<div class="form-check">
    <input class="form-check-input" type="checkbox" name="toppings" value="bacon"
           id="topping-bacon">
    <label class="form-check-label" for="topping-bacon">Bacon</label>
</div>
</div>

<!-- Delivery Address -->
<div class="mb-3">
    <label for="delivery-address" class="form-label">Delivery Address:</label>
    <input type="text" id="delivery-address" name="deliveryAddress" class="form-control">
</div>

<!-- Submit Button -->
<button type="submit" name="submit" class="btn btn-primary">Submit</button>

</form>

</div>
</div>
</div>
</div>
<%@ include file="scripts.jsp"%>

</body>
</html>