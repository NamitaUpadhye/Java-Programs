package com.cookiesservlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/cookiesServlet")
public class cookiesservlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        int visitCount = 1;

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    name = c.getValue();
                }
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue()) + 1;
                }
            }
        }

        // Create cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Expiry: 60 seconds
        nameCookie.setMaxAge(60);
        countCookie.setMaxAge(60);

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Output
        out.println("<html><body>");

        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times.</h3>");

        // Display cookies
        out.println("<h3>Cookie List:</h3>");
        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("Name: " + c.getName() +
                            " | Value: " + c.getValue() + "<br>");
            }
        }

        out.println("<br><a href='refresh.html'>Visit Again</a>");
        out.println("<p>Wait 1 minute to test cookie expiry.</p>");

        out.println("</body></html>");
    }
}