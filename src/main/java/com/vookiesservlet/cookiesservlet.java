package com.vookiesservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class cookiesservlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");
        int visitCount = 1;

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    userName = c.getValue();
                }
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue()) + 1;
                }
            }
        }

        // Create cookies
        if (userName != null && !userName.isEmpty()) {

            Cookie nameCookie = new Cookie("user", userName);
            Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

            // Expiry = 60 seconds (1 minute)
            nameCookie.setMaxAge(60);
            countCookie.setMaxAge(60);

            response.addCookie(nameCookie);
            response.addCookie(countCookie);
        }

        // HTML Response
        out.println("<html><body>");

        if (userName != null) {
            out.println("<h2 style='color:blue;'>Welcome back, " + userName + "!</h2>");
            out.println("<h3 style='color:magenta;'>You have visited this page " + visitCount + " times!</h3>");

            // Display cookies
            out.println("<h3>Cookie List:</h3>");
            if (cookies != null) {
                for (Cookie c : cookies) {
                    out.println("Name: " + c.getName() +
                                " | Value: " + c.getValue() + "<br>");
                }
            }

            out.println("<br><a href='CookieServlet'>Visit Again</a>");
            out.println("<p>Wait 1 minute to test cookie expiry.</p>");
        } else {
            out.println("<h2 style='color:red;'>Enter your name</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }

        out.println("</body></html>");
    }
}