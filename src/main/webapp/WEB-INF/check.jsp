<html>
<body>
<%
    String user = (String) session.getAttribute("user");

    if(user == null) {
%>
        <h3>Session Expired!</h3>
<%
    } else {
%>
        <h3>Session Active. Hello <%= user %></h3>
<%
    }
%>
</body>
</html>