<%@ page contentType="text/html;charset=UTF-8"
         language="java" isErrorPage="true" %>
<html>
<head>
    <title>Error Handling page</title>
</head>
<body>
<h2 style="color: red">
    Invalid input caused due to : <%=exception.getMessage()%>
</h2>
</body>
</html>
