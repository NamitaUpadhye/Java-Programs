<%
    String name = request.getParameter("username");

    if (name != null) {
        session.setAttribute("user", name);

        // Set session expiry to 1 minute (60 seconds)
        session.setMaxInactiveInterval(60);
    }
%>

<html>
<body>
    <h2>
        Hello <%= session.getAttribute("user") %>!
    </h2>

    <p>Session will expire in 1 minute.</p>

    <a href="check.jsp">Check Session</a>
</body>
</html>