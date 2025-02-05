<%--
  Created by IntelliJ IDEA.
  User: sande
  Date: 01-06-2024
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create course form</title>
</head>
<body>
    <form action="courses" method="get">
        <table>
            <tr>
                <td>Course ID</td>
                <td><input type="number" name="courseId" /></td>
            </tr>
            <tr>
                <td>Course Name</td>
                <td><input type="text" name="courseName" /></td>
            </tr>
            <tr>
                <td>Course Description</td>
                <td><input type="text" name="courseDesc" /></td>
            </tr>
            <tr>
                <td>Course Price</td>
                <td><input type="number" name="coursePrice" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Add Course" /></td>
            </tr>
        </table>
    </form>
</body>
</html>
