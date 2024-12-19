<%@ page import="com.ajay.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html ; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Listing Page</title>
</head>
<body>
<h1> Student Listing goes here</h1>
<table style="border: red 1px solid">
    <tr style="border: red 1px solid">
        <td>ID</td>
        <td>Name</td>
        <td>Email</td>
        <td>Age</td>
    </tr>

    <%
        List<Student> studentList = (List<Student>) request.getAttribute("student");
        for (Student student : studentList) {

    %>
    <tr style="border: red 1px solid">
        <td><%=student.getId()%>
        </td>
        <td><%=student.getName()%>
        </td>
        <td><%=student.getEmail()%>
        </td>
        <td><%=student.getAge()%>
        </td>
    </tr>

    <%}%>
</table>
</body>
</html>