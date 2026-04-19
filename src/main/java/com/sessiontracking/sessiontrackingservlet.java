package com.sessiontracking;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/SessionTracker")
public class sessiontrackingservlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        String name = request.getParameter("username");

        if (name != null) {
            session.setAttribute("user", name);
        }

        // 1 minute expiry
        session.setMaxInactiveInterval(60);

        String user = (String) session.getAttribute("user");

        out.println("<html><body>");

        if (user != null) {
            out.println("<h2>Hello " + user + "!</h2>");
            out.println("<p>Session expires in 1 minute.</p>");
        } else {
            out.println("<h3>Session Expired!</h3>");
        }

        out.println("</body></html>");
    }
}