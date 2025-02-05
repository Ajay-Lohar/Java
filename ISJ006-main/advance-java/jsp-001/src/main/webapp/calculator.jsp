<%--
  Created by IntelliJ IDEA.
  User: sande
  Date: 12-03-2024
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="calculate.jsp" method="get">
    <table>
        <tr>
            <td>number1</td>
            <td><input type="number" name="number1"></td>
        </tr>
        <tr>
            <td>number2</td>
            <td><input type="number" name="number2"></td>
        </tr>
        <tr>
            <td>Operation</td>
            <td><input type="text" name="operation"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Calculate"></td>
        </tr>
    </table>
</form>
</body>
</html>
