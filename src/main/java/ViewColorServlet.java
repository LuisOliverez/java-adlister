import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String color = (String) request.getSession().getAttribute("color");
        request.setAttribute("color", color);

        // Forward to the JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("viewcolor.jsp");
        dispatcher.forward(request, response);
    }


}