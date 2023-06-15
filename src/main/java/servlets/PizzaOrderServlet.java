package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlets.PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        if (request.getMethod().equals("POST")) {


            // Retrieve form data
            String crustType = request.getParameter("crustType");
            String sauceType = request.getParameter("sauceType");
            String pizzaSize = request.getParameter("sizeType");
            String[] toppings = request.getParameterValues("toppings");
            String deliveryAddress = request.getParameter("deliveryAddress");

            // Print the selected choices
            System.out.println("Crust: " + crustType);
            System.out.println("Sauce Type: " + sauceType);
            System.out.println("Pizza Size: " + pizzaSize);
            if (toppings != null) {
                System.out.println("Toppings:");
                for (String topping : toppings) {
                    System.out.println("- " + topping);
                }
            }
            System.out.println("Delivery Address: " +deliveryAddress);


        request.setAttribute("pizzaSize", pizzaSize);
        request.setAttribute("crustType", crustType);
        request.setAttribute("sauceType", sauceType);
        request.setAttribute("toppings", toppings);
        request.setAttribute("deliveryAddress", deliveryAddress);
        }

        // Forward to the JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("partials/pizzaForm.jsp");
        dispatcher.forward(request, response);





    }
}


