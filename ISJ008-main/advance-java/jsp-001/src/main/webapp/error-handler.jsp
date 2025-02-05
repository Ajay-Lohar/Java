<%@ page contentType="text/html;charset=UTF-8" language="java"
         isErrorPage="true" %>
<html>
<head>
    <title>error handler</title>
</head>
<body>
<h1>Error Handler</h1>
<h3 style="color: red"> Error occurred due to
    <%=exception.getMessage()%>
</h3>
</body>
</html>
