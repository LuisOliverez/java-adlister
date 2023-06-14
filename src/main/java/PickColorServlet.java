import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PickColorServlet", urlPatterns = "/pickcolor")
public class PickColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward to the JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("pickcolor.jsp");
        dispatcher.forward(request, response);
    }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String color = request.getParameter("color");

            request.setAttribute("color", color);

//
//            private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//                response.setContentType("text/html");
//
//                if (request.getMethod().equals("POST")) {
//                    // Retrieve form data
//                    String color = request.getParameter("color");
//
//                    // Print the selected choices
//                    System.out.println("You entered: " + color);
//
//                    request.setAttribute("color", color);


                    RequestDispatcher dispatcher = request.getRequestDispatcher("/ViewColorServlet");
                    dispatcher.forward(request, response);

                }
}


