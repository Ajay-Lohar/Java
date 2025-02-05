<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tables from 1 to 30</title>
</head>
<body>
<table style="border: solid red thick">
    <%

        for (int i = 1; i <= 10; i++) {
    %>
    <tr>
        <%
            for (int j = 1; j <= 30; j++) { %>
        <td>
            <%=i * j%>
        </td>
        <% }%>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
