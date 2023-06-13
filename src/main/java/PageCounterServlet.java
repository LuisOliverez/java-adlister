import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "PageCounterServlet", urlPatterns = "/count")
public class PageCounterServlet extends HttpServlet {
    private int pageViews;

    public void init() throws ServletException {
        super.init();
        pageViews = 0;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String reset = request.getParameter("reset");

        if (reset != null && reset.equals("true")) {
            pageViews = 0;
        } else {
            pageViews++;
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><h1> Page Views: " + pageViews + "</h1></html>");
    }
}
