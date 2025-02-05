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
    <title>Get All Students</title>
    <h2>Students list</h2>

    <%
        List<Student> studentList = (List<Student>) request.getAttribute("students");
        for (Student student : studentList) {
            out.println(student);
        }

    %>
</head>
<body>

</body>
</html>
