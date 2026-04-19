<html>
<body>
<%
    String user = (String) session.getAttribute("user");

    if (user == null) {
%>
        <h2>Session Expired!</h2>
<%
    } else {
%>
        <h2>Session Active. Hello <%= user %></h2>
<%
    }
%>
</body>
</html>