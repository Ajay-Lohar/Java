<html>
<body>
<h2>Create Course Form</h2>

<form action="http://localhost:8080/servlet_web_app_003_war/course/create" method="post">
    <table>
        <tr>
            <td>Enter Course ID</td>
            <td><input type="number" name="id"></td>
        </tr>
        <tr>
            <td>Enter Course Name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Enter Course Price</td>
            <td><input type="number" name="price"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Add Course"></td>
        </tr>
    </table>
</form>
</body>
</html>
