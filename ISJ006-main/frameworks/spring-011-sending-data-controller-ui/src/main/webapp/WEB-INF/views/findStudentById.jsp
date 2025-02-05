<%@ page import="com.itshaala.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: sande
  Date: 23-03-2024
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find by Id Students</title>
    <h2>Student By Id</h2>

    <%
        out.println((Student) request.getAttribute("student"));
    %>
</head>
<body>

</body>
</html>
