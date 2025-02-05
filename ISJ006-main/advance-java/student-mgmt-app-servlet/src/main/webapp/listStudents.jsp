<%@ page import="com.itshaala.model.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="com.itshaala.service.StudentService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Students</title>
</head>
<body>
<%
    StudentService studentService = new StudentService();
    List<Student> studentList = studentService.getAllStudents();
%>
<table style="border: red 1px solid">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Phone</th>
        <th>Address</th>
    </tr>
    <%for (Student student : studentList) {%>
    <tr>
        <td><%=student.getStudentId()%>
        </td>
        <td><%=student.getStudentName()%>
        </td>
        <td><%=student.getStudentEmail()%>
        </td>
        <td><%=student.getStudentPhone()%>
        </td>
        <td><%=student.getStudentAddress()%>
        </td>
    </tr>

    <%}%>
</table>

</body>
</html>
