import javax.net.ssl.HandshakeCompletedEvent;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import javax.servlet.RequestDispatcher;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("isAdmin") != null) {
            response.sendRedirect("/profile");
            return;
        }

        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check if the username and password are valid
        if (isAdmin(username, password)) {
            HttpSession session = request.getSession();
            request.getSession().setAttribute("user", username);
            session.setAttribute("isAdmin", true);
            response.sendRedirect("/profile"); // Redirect to the profile page
        } else {
            response.sendRedirect("/login");
        }
    }

    private boolean isAdmin(String username, String password) {
        return username.equals("admin") && password.equals("password");
    }

}