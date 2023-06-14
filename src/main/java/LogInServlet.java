//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name = "HelloWorldServlet", urlPatterns = "/login")
//public class LogInServlet extends HttpServlet {
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/webapp/login.jsp");
//        dispatcher.forward(request, response);
//    }
//
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        boolean isAuthenticated = authenticate(username, password);
//
//    if (isAuthenticated){
//        response.sendRedirect("profile.jsp");
//    }else {
//        request.setAttribute("errorMessage", "Invalid username or password");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
//        dispatcher.forward(request, response);
//        }
//    }
//        private boolean authenticate(String username, String password){
//            String validUsername = "admin";
//            String validPassword = "password";
//        return (username.equals(validUsername) && password.equals(validPassword));
//        }
//    }
