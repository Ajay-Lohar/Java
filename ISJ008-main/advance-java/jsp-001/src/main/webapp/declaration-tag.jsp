<html>
<body>
<h2>Scriptlet Tag</h2>
<%!
    int instanceVariable = 100;
    static int staticVariable = 200;

    int getInt() {
        return 300;
    }

    static int getIntStaticMethod() {
        return 400;
    }

    class A {
    }

    static class B {
    }
%>
<ul>
    <li>using declaration tag we can
        <ul>
            <li>define instance variables</li>
            <li>define static variables</li>
            <li>define instance methods</li>
            <li>define static methods</li>
            <li>define nested inner class</li>
            <li>define nested static class</li>
        </ul>
    </li>
</ul>
</body>
</html>
