<%--
  These are jsp commenets and not visible to end user
  User: sande
  Date: 12-03-2024
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scriptlet tag</title>
</head>
<body>

<%
    // static int a = 100;
    //static {}
    //static class A{}
    //this code goes inside the jspService method
    //service methods gets two input : req and resp
    java.io.PrintWriter writer = response.getWriter();
    for (int i = 1; i <= 10; i++) {
        writer.print(i);
    }
%>
<hr/>

<%=20 * 20%>
<%="this is expression tag"%>
<hr/>
Declaration Tag
<%!
    //variables - IV, SV
    //methods - IM, SM

    static void display() {
    }

    static java.util.List<Integer> getIntegers() {
        return java.util.Arrays.asList(10, 20, 30, 40, 50);
    }

%>
</hr>
<%=getIntegers()%>

</body>
</html>
