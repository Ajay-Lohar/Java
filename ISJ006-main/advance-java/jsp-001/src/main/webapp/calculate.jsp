<%@ page contentType="text/html;charset=UTF-8" language="java"
         errorPage="error.jsp" %>
<html>
<head>
    <title>calculate</title>
</head>
<body>
<%
    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    String operation = request.getParameter("operation");
    switch (operation) {
        case "+" : out.print("Addition is " + (number1 + number2));break;
        case "-" : out.print("Sub is " + (number1 - number2));break;
        case "*" : out.print("Multiplication is " + (number1 * number2));break;
        case "/" : out.print("Division is " + (number1 / number2));break;
        case "%" : out.print("Remainder is " + (number1 % number2));break;
        default : out.print("Invalid operation");break;
    }
%>
</body>
</html>
