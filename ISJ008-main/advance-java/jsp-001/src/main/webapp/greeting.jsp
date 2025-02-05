<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Greetings</title>
</head>
<body>
<%
    LocalDateTime currentTime = LocalDateTime.now();
    int currentTimeHour = currentTime.getHour();
    if (currentTimeHour < 12) out.println("Good morning");
    if(currentTimeHour >12 && currentTimeHour < 16)out.println("Good Afternoon");
    if(currentTimeHour >16 && currentTimeHour < 20)out.println("Good Evening");
    if(currentTimeHour >20 && currentTimeHour < 23)out.println("Good Night");
%>

</body>
</html>
