import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (!((boolean) request.getSession().getAttribute("isAdmin"))) {
            response.sendRedirect("/login");
            return;
        }

        // Check if the user requested a logout
        String logoutParam = request.getParameter("logout");
        if (logoutParam != null && logoutParam.equals("true")) {
            session.invalidate(); // Invalidate the session and clear all session attributes
            response.sendRedirect("/login");
            return;
        }

        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            request.getSession().setAttribute("user", username); // Set the "user" attribute in session
            request.getRequestDispatcher("/profile"); // Redirect to the profile page

        }
            response.sendRedirect("/login");
            return;

    }
}