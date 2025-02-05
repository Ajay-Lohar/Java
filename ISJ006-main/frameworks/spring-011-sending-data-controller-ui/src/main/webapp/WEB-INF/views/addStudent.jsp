<%--
  Created by IntelliJ IDEA.
  User: sande
  Date: 23-03-2024
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>

<form action="students" method="post">
    <table>
        <tr>
            <td>
                Id
            </td>
            <td>
                <input type="number" name="id">
            </td>
        </tr>
        <tr>
            <td>
                Name
            </td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>
                Email
            </td>
            <td>
                <input type="email" name="email">
            </td>
        </tr>

        <tr>
            <td>
                Phone
            </td>
            <td>
                <input type="number" name="phone">
            </td>
        </tr>

        <tr>
            <td>
                Address
            </td>
            <td>
                <input type="text" name="address">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add Student">
            </td>
        </tr>
    </table>

</form>

</body>
</html>
